package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_nextByte_01 {
    
    public static void main(String[] args) {
        
        String s = "Simple math operation: 2 + 3 = 5";
        
        Scanner input = new Scanner(s);
        
        while (input.hasNext()) {            
            if (input.hasNextByte()) {
                System.out.println(input.nextByte() + " (this is a byte value)");
            } else {
                System.out.println(input.next());
            }
        }
        
    }
    
}
