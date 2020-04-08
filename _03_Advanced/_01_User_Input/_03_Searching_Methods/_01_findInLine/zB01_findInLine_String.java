package _03_Advanced._01_User_Input._03_Searching_Methods._01_findInLine;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_findInLine_String {

    public static void main(String[] args) {

        String s = "Simple math operation: 2 + 3 = 5";

        Scanner input = new Scanner(s);

        System.out.println(input.findInLine(".ath"));
        
        System.out.println(input.nextLine());

    }

}
