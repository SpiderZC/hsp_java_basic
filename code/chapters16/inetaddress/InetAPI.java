package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAPI {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println("================");
            InetAddress host = InetAddress.getByName("www.baidu.com");
            System.out.println(host);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
