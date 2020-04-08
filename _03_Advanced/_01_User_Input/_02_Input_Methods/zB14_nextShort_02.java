package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB14_nextShort_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        short id;
        
        System.out.print("Enter your id: ");
        id = input.nextShort();
        
        System.out.println("\n------------ User Info ------------");
        System.out.println("User id: " + id);
        
    }
    
}
