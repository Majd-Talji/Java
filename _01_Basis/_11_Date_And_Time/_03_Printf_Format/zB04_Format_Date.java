package _01_Basis._11_Date_And_Time._03_Printf_Format;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_Format_Date {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.printf("%s %tA %<te-%<tm-%<tY \n", "Today is:", date);
        
    }
    
}
