package _01_Basis._11_Date_And_Time._03_Printf_Format;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_Format_Date {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.printf("%1$s %2$tA %2$te-%2$tm-%2$tY\n", "Today is:", date);
        
    }
    
}
