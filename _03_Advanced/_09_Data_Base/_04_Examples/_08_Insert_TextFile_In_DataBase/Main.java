package _03_Advanced._09_Data_Base._04_Examples._08_Insert_TextFile_In_DataBase;

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

            PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee(file) VALUES(?)");

            FileReader fr = new FileReader("C:\\MyFiles\\myfile.txt");
            
            pstmt.setCharacterStream(1, fr);

            pstmt.executeUpdate();
            
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
