package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_getTime {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        long secondsPassed = date.getTime();
        
        System.out.println("The number of seconds from 1/1/1970 to " + date + " is: " + secondsPassed);
        
    }
    
}
