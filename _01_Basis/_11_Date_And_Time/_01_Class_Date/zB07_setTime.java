package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_setTime {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        date.setTime(10000);
        
        System.out.println("Time after setting: " + date);
        
    }
    
}
