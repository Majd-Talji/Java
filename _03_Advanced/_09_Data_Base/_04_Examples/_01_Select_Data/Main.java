package _03_Advanced._09_Data_Base._04_Examples._01_Select_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select name from employee");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
