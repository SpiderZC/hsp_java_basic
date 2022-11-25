package socket3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket3 = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("Server listener");
            socket3 = serverSocket.accept();
            inputStream = socket3.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.readLine());

            outputStream = socket3.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("Hello Client");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
                socket3.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
