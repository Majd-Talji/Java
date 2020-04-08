package _03_Advanced._01_User_Input._04_Checking_Methods;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_hasNext_String {

    public static void main(String[] args) {

        String s = "Simple math operation: 2 + 3 = 5";

        Scanner input = new Scanner(s);
        
        System.out.println("hasNext()? " + input.hasNext(Pattern.compile("..mple")));

        System.out.println(input.next());        
        
        System.out.println("hasNext()? " + input.hasNext(Pattern.compile(".at.")));

        System.out.println(input.next());
        
        System.out.println("hasNext()? " + input.hasNext(Pattern.compile(".java")));
        
        System.out.println(input.nextLine());
        
    }

}
