package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) {
            OutputStream outputstream = null;
            Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("Client socket:" + socket.getClass());
            outputstream = socket.getOutputStream();
            outputstream.write("hello Server".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputstream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
