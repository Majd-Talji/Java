package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_compareTo {
    
    public static void main(String[] args) {
        
        Date date1 = new Date(0);
        Date date2 = new Date(5000);
        Date date3 = date1;
        
        int comparison1 = date1.compareTo(date2);
        int comparison2 = date2.compareTo(date1);
        int comparison3 = date1.compareTo(date3);
        
        System.out.println("Comparison 1 result : " + comparison1);
        System.out.println("Comparison 2 result : " + comparison2);
        System.out.println("Comparison 3 result : " + comparison3);
        
    }
    
}
