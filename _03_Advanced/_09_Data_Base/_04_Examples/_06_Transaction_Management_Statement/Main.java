package _03_Advanced._09_Data_Base._04_Examples._06_Transaction_Management_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
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

            con.setAutoCommit(false);
            
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO employee(fname, lname, email, phone) VALUES('Mohamad', 'Harmer', 'mohamad@gmail.com', '+96112385456')");
            stmt.executeUpdate("INSERT INTO employee(fname, lname, email, phone) VALUES('Ziad', 'Masri', 'ziad@gmail.com', '+96111223387')");
            stmt.executeUpdate("INSERT INTO employee(fname, lname, email, phone) VALUES('Wissam', 'Mostafa', 'wissam@gmail.com', '+96103876542')");
            stmt.executeUpdate("INSERT INTO employee(fname, lname, email, phone) VALUES('Nader', 'Karim', 'nader@gmail.com', '+96170180190')");
            stmt.executeUpdate("INSERT INTO employee(fname, lname, email, phone) VALUES('Rola', 'Dannawi', 'rola@gmail.com', '+96180776540')");

            con.commit();
            
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
