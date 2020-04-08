package _03_Advanced._01_User_Input._03_Searching_Methods._03_match;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_match {

    public static void main(String[] args) {

        String s = "Simple math operation: 2 + 3 = 5";

        Scanner input = new Scanner(s);
        
        input.findInLine("ma..");

        System.out.println("Last match result: " + input.match());
        
        System.out.println(input.nextLine());

    }

}
