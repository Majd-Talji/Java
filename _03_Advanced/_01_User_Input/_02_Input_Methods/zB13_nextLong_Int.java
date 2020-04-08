package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB13_nextLong_Int {
    
    public static void main(String[] args) {
        
        String s = "Simple math opeation: 2 + 3 = 5";
        
        Scanner input = new Scanner(s);
        
        while (input.hasNext()) {            
            if (input.hasNextLong(4)) {
                System.out.println(input.nextLong(4)+ " (this is a long value)");
            } else {
                System.out.println(input.next());
            }
        }
        
    }
    
}
