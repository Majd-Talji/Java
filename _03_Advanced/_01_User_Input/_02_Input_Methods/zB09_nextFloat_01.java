package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_nextFloat_01 {

    public static void main(String[] args) {

        String s = "Simple math opeation: 2 + 3 = 5";

        Scanner input = new Scanner(s);
        
        while (input.hasNext()) {            
            if (input.hasNextFloat()) {
                System.out.println(input.nextFloat() + " (this is a float value)");
            } else {
                System.out.println(input.next());
            }
        }

    }

}
