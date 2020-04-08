package _03_Advanced._09_Data_Base._04_Examples._10_Insert_ImageFile_In_DataBase;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee(image) VALUES(?)");

            FileInputStream fis = new FileInputStream("C:\\MyFiles\\my-imge.jpg");
            
            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();
            
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
