package socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) {
            OutputStream outputstream = null;
            InputStream inputStream = null;
            BufferedReader bufferedReader = null;
            BufferedWriter bufferedWriter = null;
            Socket socket3 = null;
        try {
            socket3 = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("Client socket3:" + socket3.getClass());
            outputstream = socket3.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputstream));
            bufferedWriter.write("Hello Server");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            inputStream = socket3.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                socket3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
