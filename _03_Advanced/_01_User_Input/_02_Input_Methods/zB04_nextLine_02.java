package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_nextLine_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String description;
        
        System.out.println("What is Google?");
        description = input.nextLine();
        
        System.out.println("\n------ Website Description ------");
        System.out.println(description);
        
    }
    
}
