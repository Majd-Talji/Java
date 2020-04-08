package _03_Advanced._09_Data_Base._04_Examples._03_Select_Where_Data;

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

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM employee WHERE id = ?");

            System.out.print("Select Employee, Enter his ID: ");
            int id = input.nextInt();
            
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            
            System.out.println("\nAll existing information about this employee are the following:");
            System.out.println("ID:         " + rs.getInt(1));
            System.out.println("First Name: " + rs.getString(2));
            System.out.println("Last Name:  " + rs.getString(3));
            System.out.println("Email:      " + rs.getString(4));
            System.out.println("Phone:      " + rs.getString(5));
            
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
