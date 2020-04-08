package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_nextByte_int_01 {
    
    public static void main(String[] args) {
        
        String s = "Simple math opeation: 2 + 3 = 5";
        
        Scanner input = new Scanner(s);
        
        while (input.hasNext()) {            
            if (input.hasNextByte(4)) {
                System.out.println(input.nextByte(4) + " (this is a byte value)");
            } else {
                System.out.println(input.next());
            }
        }
        
    }
    
}
