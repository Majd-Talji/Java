package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_next_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String fname;
        String lname;
        
        System.out.print("Enter your first name: ");
        fname = input.next();
        
        System.out.print("Enter your last name: ");
        lname = input.next();
        
        System.out.println("\n------------- User Info -------------");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        
    }
    
}
