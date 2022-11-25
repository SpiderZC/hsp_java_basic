package socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket2 = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("9999 listener");
            socket2 = serverSocket.accept();
            System.out.println("server socket2" + socket2.getClass());
            inputStream = socket2.getInputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            socket2.shutdownInput();
            outputStream = socket2.getOutputStream();
            outputStream.write("hello Client".getBytes());
            socket2.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                socket2.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
