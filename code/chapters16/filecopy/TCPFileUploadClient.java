package filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        String desertFile = "/home/spider/Pictures/z.jpeg";

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(desertFile));

        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        bufferedOutputStream.write(bytes);

        bufferedInputStream.close();
        socket.shutdownOutput();

        bufferedOutputStream.close();
        socket.close();
    }
}
