package _03_Advanced._01_User_Input._04_Checking_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_hasNextInt_radix {

    public static void main(String[] args) {

        String s = "Simple math opeation: 0 + 1 + 2 + 3 = 5";

        Scanner input = new Scanner(s);

        while (input.hasNext()) {

            System.out.println("hasNextInt(2)? " + input.hasNextInt(2));

            System.out.println(input.next());

        }

    }

}
