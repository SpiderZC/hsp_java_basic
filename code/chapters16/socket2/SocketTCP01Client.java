package socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) {
            OutputStream outputstream = null;
            InputStream inputStream = null;
            Socket socket2 = null;
        try {
            socket2 = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("Client socket2:" + socket2.getClass());
            outputstream = socket2.getOutputStream();
            outputstream.write("hello Server".getBytes());
            socket2.shutdownOutput();
            inputStream = socket2.getInputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            socket2.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputstream.close();
                inputStream.close();
                socket2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
