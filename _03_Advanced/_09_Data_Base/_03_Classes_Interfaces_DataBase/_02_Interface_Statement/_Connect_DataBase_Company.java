package _03_Advanced._09_Data_Base._03_Classes_Interfaces_DataBase._02_Interface_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _Connect_DataBase_Company {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select first_name, last_name from employee");

            while (rs.next()) {
                System.out.println(rs.getString("first_name") + "  " + rs.getString("last_name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
