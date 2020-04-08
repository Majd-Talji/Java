package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_nextByte_int_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        byte year;
        
        System.out.print("Enter your years of experience: ");
        year = input.nextByte(10);
        
        System.out.println("\n------------- User Info -------------");
        System.out.println("User years experience: " + year + " years");
        
    }
    
}
