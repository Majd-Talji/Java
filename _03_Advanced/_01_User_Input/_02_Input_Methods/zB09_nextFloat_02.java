package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_nextFloat_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float salary;
        
        System.out.print("Enter your salary: ");
        salary = input.nextFloat();
        
        System.out.println("\n------------- User Info -------------");
        System.out.println("User salary: " + salary + "€");
        
    }
    
}
