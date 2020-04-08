package _03_Advanced._01_User_Input._04_Checking_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_hasNext {

    public static void main(String[] args) {

        String s = "Simple math operation: 2 + 3 = 5";

        Scanner input = new Scanner(s);
        
        System.out.println("hasNext()? " + input.hasNext());

        System.out.println("hasNext()? " + input.hasNext());
        
        System.out.println(input.nextLine());
        
        System.out.println("hasNext()? " + input.hasNext());

    }

}
