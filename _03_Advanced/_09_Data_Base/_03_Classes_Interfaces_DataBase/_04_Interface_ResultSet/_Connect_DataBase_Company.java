package _03_Advanced._09_Data_Base._03_Classes_Interfaces_DataBase._04_Interface_ResultSet;

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

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery("select * from employee");
            
            rs.absolute(5);

            while (rs.next()) {
                System.out.println(rs.getInt(1)+ ":  " + rs.getString(2) + " - " + rs.getString(3)+ " " + rs.getString(4));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
