package _03_Advanced._07_Networking._01_URL;

import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_URL_openStream_InputStream {

    public static void main(String[] args) {

        String data = "";

        try {

            URL url = new URL("http://localhost//MyWebSeite/java.php");
            
            InputStream is = url.openStream();
            
            int c;
            
            while ((c = is.read()) != -1) {                
                data += (char)c;
            }
            
            is.close();
            
            System.out.println(data);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
