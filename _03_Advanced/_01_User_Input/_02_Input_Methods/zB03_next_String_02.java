package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_next_String_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String fname;
        String lname;
        
        System.out.print("Enter first name: ");
        fname = input.next("...*");
        
        System.out.print("Enter last name: ");
        lname = input.next("...");
        
        System.out.println("\n----------- User Info -----------");
        System.out.println("First Name. " + fname);
        System.out.println("Last Name. " + lname);
        
    }
    
}
