package _03_Advanced._09_Data_Base._04_Examples._11_Select_TextFile_In_DataBase;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            PreparedStatement pstmt = con.prepareStatement("SELECT image FROM employee WHERE id = ?");

            pstmt.setInt(1, 1);

            ResultSet rs = pstmt.executeQuery();

            rs.next();

            Blob b = rs.getBlob(1);
            
            byte imageBytes[] = b.getBytes(1, (int)b.length());
            
            FileOutputStream fos = new FileOutputStream("C:\\MyFiles\\retrived-imge.jpg");
            
            fos.write(imageBytes);
            
            fos.close();

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
