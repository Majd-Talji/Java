package _03_Advanced._07_Networking._02_URLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_getHeaderFields_Method {

    public static void main(String[] args) {

        try {
            
            URL url = new URL("http://localhost//MyWebSeite/java.php");
            
            URLConnection connection = url.openConnection();
            
            Map<String, List<String>> map = connection.getHeaderFields();
            
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
