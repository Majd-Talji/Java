package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB10_nextInt_01 {

    public static void main(String[] args) {

        String s = "Simple math operation: 3 + 4 = 7";

        Scanner input = new Scanner(s);

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                System.out.println(input.nextInt() + " (this is a int value)");
            } else {
                System.out.println(input.next());
            }
        }

    }

}
