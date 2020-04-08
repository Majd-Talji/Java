package _03_Advanced._09_Data_Base._04_Examples._09_Select_TextFile_In_DataBase;

import java.io.FileWriter;
import java.io.Reader;
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

            PreparedStatement pstmt = con.prepareStatement("SELECT file FROM employee WHERE id = ?");

            pstmt.setInt(1, 1);

            ResultSet rs = pstmt.executeQuery();

            rs.next();

            Clob clob = rs.getClob(1);

            Reader r = clob.getCharacterStream();

            FileWriter fw = new FileWriter("C:\\MyFiles\\retrivedFile.txt");
            
            int c;
            while ((c = r.read()) != -1) {                
                fw.write((char)c);
            }
            
            fw.close();

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
