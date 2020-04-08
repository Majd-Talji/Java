package _03_Advanced._01_User_Input._02_Input_Methods;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_nextLine_01 {
    
    public static void main(String[] args) {
        
        String s = "line 1 \nline 2 \nline 3";
        
        Scanner input = new Scanner(s);
        
        while (input.hasNextLine()) {            
            System.out.println(input.nextLine());
        }
        
    }
    
}
