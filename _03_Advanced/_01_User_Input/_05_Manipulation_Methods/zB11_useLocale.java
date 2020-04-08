package _03_Advanced._01_User_Input._05_Manipulation_Methods;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB11_useLocale {
    
    public static void main(String[] args) {
        
        String s = "In Hexadecimal 'A' = A";
        
        Scanner input = new Scanner(s);
        
        input.useRadix(16);
        
        while (input.hasNext()) {            
            if (input.hasNextInt()) {
                System.out.print(input.nextInt() + " ");
            } else {
                System.out.print(input.next() + " ");
            }
        }
                
        System.out.println();
        
    }
    
}
