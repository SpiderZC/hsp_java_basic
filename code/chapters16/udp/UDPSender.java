package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(9998);
            byte[] bytes = "hello, 明天吃火锅".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9999);
            datagramSocket.send(datagramPacket);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }
    }
}
