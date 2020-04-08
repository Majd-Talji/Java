package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_skip_Pattern {
    
    public static void main(String[] args) {
        
        String s = "Simple math operation: 2 + 3 = 5";
        
        Scanner input = new Scanner(s);
        
        input.skip(Pattern.compile("......."));
        
        System.out.println(input.nextLine());
        
    }
    
}
