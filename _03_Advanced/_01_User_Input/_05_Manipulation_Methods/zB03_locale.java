package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_locale {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Used locale is: " + input.locale());
        input.useLocale(Locale.ITALY);
        
    }
    
}
