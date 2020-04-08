package _03_Advanced._09_Data_Base._04_Examples._07_Transaction_Management_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String email;
        String phone;

        char addUser;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "");

            con.setAutoCommit(false);

            PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee(fname, lname, email, phone) VALUES(?, ?, ?, ?)");

            do {

                System.out.print("\nIf you want to add a new user, enter 'y': ");
                addUser = input.next().charAt(0);

                if (addUser == 'y') {
                    System.out.print("Enter first name: ");
                    firstName = input.next();

                    System.out.print("Enter last name: ");
                    lastName = input.next();

                    System.out.print("Enter email address: ");
                    email = input.next();

                    System.out.print("Enter phone number: ");
                    phone = input.next();

                    pstmt.setString(1, firstName);
                    pstmt.setString(2, lastName);
                    pstmt.setString(3, email);
                    pstmt.setString(4, phone);

                    pstmt.executeUpdate();
                }

            } while (addUser == 'y');

            con.commit();

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
