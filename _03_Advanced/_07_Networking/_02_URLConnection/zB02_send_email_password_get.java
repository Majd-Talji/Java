package _03_Advanced._07_Networking._02_URLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_send_email_password_get {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String email;
        String password;

        try {
            
            System.out.print("Enter you email: ");
            email = input.next();
            
            System.out.print("Enter you password: ");
            password = input.next();
            
            String urlLink = "http://localhost/MyWebSeite/test.php?email=" + email + "&password=" + password;

            URL url = new URL(urlLink);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String data = "";
            String line;
            
            while ((line = br.readLine()) != null) {                
                data += line;
            }
            
            br.close();
            
            System.out.println("\nServer Response");
            System.out.println(data);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
