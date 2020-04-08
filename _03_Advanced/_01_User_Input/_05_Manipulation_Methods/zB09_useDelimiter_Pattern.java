package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_useDelimiter_Pattern {
    
    public static void main(String[] args) {
        
        String s = "First you should study java 101, then java 102, then java 103 etc..";
        
        Scanner input = new Scanner(s);
        
        input.useDelimiter(Pattern.compile("java"));
        
        while (input.hasNext()) {
            System.out.print(input.next());
        }
        
        System.out.println();
        
    }
    
}
