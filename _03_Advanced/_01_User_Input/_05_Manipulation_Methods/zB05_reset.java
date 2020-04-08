package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_reset {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Default local is: " + input.locale());
        System.out.println("Defalut Radix is: " + input.radix());
        System.out.println();
        
        input.useLocale(Locale.FRANCE);
        input.useRadix(16);
        
        System.out.println("New local is: " + input.locale());
        System.out.println("New radix is: " + input.radix());
        System.out.println();
        
        input.reset();
        
        System.out.println("Default local is: " + input.locale());
        System.out.println("Defalut Radix is: " + input.radix());
        
    }
    
}
