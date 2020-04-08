package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_equals {
    
    public static void main(String[] args) {
        
        Date date1 = new Date(0);
        Date date2 = new Date(5000);
        Date date3 = date1;
        
        boolean check1 = date1.equals(date2);
        boolean check2 = date1.equals(date3);
        
        System.out.println("check 1 result: " + check1);
        System.out.println("check 2 result: " + check2);
        
    }
    
}
