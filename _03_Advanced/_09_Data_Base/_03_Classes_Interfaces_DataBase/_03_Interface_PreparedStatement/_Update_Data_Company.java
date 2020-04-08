package _03_Advanced._09_Data_Base._03_Classes_Interfaces_DataBase._03_Interface_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _Update_Data_Company {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            PreparedStatement pstmt = con.prepareStatement("UPDATE employee SET name = ? WHERE id = ?");

            System.out.print("Select Employee, Enter his ID: ");
            int id = input.nextInt();
            
            System.out.print("Enter the new name: ");
            String name = input.next();
            
            pstmt.setString(1, name);
            
            pstmt.setInt(2, id);
            
            pstmt.executeUpdate();            
            
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
