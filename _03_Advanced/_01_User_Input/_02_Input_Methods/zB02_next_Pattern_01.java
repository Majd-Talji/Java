package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_next_Pattern_01 {
    
    public static void main(String[] args) {
        
        String s = "Simple math operation: 2 + 3 = 5";
        
        Scanner input = new Scanner(s);
        
        System.out.println(input.next(Pattern.compile(".imple")));
        
        System.out.println(input.next(Pattern.compile("....")));
        
    }
    
}
