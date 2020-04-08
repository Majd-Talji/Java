package _03_Advanced._07_Networking._01_URL;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_URL_openStream_InputStream1 {

    public static void main(String[] args) {

        String data = "";

        try {

            URL url = new URL("http://localhost//MyWebSeite/java.php");
            
            InputStream is = url.openStream();
            
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            
            BufferedReader br = new BufferedReader(isr);
            
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
