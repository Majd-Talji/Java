package _03_Advanced._01_User_Input._04_Checking_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_hasNextInt {

    public static void main(String[] args) {

        String s = "Simple math opeation: 2 + 3 = 5";

        Scanner input = new Scanner(s);

        while (input.hasNext()) {

            System.out.println("hasNextInt()? " + input.hasNextInt());

            System.out.println(input.next());

        }

    }

}
