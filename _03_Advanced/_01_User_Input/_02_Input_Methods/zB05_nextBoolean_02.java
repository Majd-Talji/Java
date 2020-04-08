package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_nextBoolean_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean answer_1;
        boolean answer_2;
        boolean answer_3;
        
        System.out.println("1) Are you a programmer ?");
        answer_1 = input.nextBoolean();
        
        System.out.println("2) Do you like painting ?");
        answer_2 = input.nextBoolean();
        
        System.out.println("3) Is your college better than Majd Talji ?");
        answer_3 = input.nextBoolean();
        
        System.out.println("\n----------- User Answers -----------");
        System.out.println("1) Are you a programmer ? " + answer_1);
        System.out.println("2) Do you like painting ? " + answer_2);
        System.out.println("3) Is your college better than Majd Talji ? " + answer_3);
        
    }
    
}
