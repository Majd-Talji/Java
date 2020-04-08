package _03_Advanced._07_Networking._01_URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Methods_in_URL {
    
    public static void main(String[] args) throws MalformedURLException {
        
        try {
            
            URL url = new URL("http://localhost//MyWebSeite/java.php");
            
            System.out.println("URL        : " + url.toString());
            System.out.println("Protocol     : " + url.getProtocol());
            System.out.println("Authority    : " + url.getAuthority());
            System.out.println("Host name    : " + url.getHost());
            System.out.println("File name    : " + url.getFile());
            System.out.println("Path         : " + url.getPath());
            System.out.println("Port         : " + url.getPort());
            System.out.println("Default Port : " + url.getDefaultPort());
            System.out.println("Reference    : " + url.getRef());
            System.out.println("Query        : " + url.getQuery());
            System.out.println("User Info    : " + url.getUserInfo());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
