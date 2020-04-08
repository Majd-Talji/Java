package _03_Advanced._07_Networking._03_InetAddress;

import java.net.InetAddress;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_InetAddress {

    public static void main(String[] args) {

        try {

            InetAddress ip = InetAddress.getByName("www.harmash.com");

            System.out.println("Host name  : " + ip.getHostName());
            System.out.println("IP address : " + ip.getHostAddress());
            
            System.out.println("Local Host : " + InetAddress.getLocalHost());
            System.out.println("Loopback   : " + InetAddress.getLoopbackAddress());

        } catch (Exception e) {
        }

    }

}
