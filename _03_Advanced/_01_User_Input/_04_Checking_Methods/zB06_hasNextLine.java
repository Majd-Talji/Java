package _03_Advanced._01_User_Input._04_Checking_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_hasNextLine {

    public static void main(String[] args) {

        String s = "line 1 \n line 2 \n line 3";

        Scanner input = new Scanner(s);

        while (input.hasNextLine()) {

            System.out.println("hasNextLine()? " + input.hasNextLine());

            System.out.println(input.nextLine());

        }

        System.out.println("hasNextLine()? " + input.hasNextLine());

    }

}
