package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB12_nextLong_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        long id;
        
        System.out.print("Enter your id: ");
        id = input.nextLong();
        
        System.out.println("\n------------ User Info ------------");
        System.out.println("User id: " + id);
        
    }
    
}
