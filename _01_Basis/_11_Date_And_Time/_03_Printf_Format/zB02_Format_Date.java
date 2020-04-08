package _01_Basis._11_Date_And_Time._03_Printf_Format;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Format_Date {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.printf("Current time: %tH:%tM:%tS\n", date, date, date);
        
    }
    
}
