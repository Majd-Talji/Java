package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_nextBoolean_01 {
    
    public static void main(String[] args) {
        
        String s = "If you define a boolean variable, then it can take true or false as value.";
        
        Scanner input = new Scanner(s);
        
        while (input.hasNext()) {            
            if (input.hasNextBoolean()) {
                System.out.println(input.nextBoolean() + " (this is a boolean value)");
            } else {
                System.out.println(input.next());
            }
        }
        
    }
    
}
