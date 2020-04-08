package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_before {
    
    public static void main(String[] args) {
        
        Date date1 = new Date(20000);
        Date date2 = new Date(40000);
        
        boolean check = date1.before(date2);
        System.out.println("date1 is before date2 : " + check);
        
        check = date2.before(date1);
        System.out.println("date2 is before date1 : " + check);
        
    }
    
}
