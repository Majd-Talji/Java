package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_toString {
    
    public static void main(String[] args) {
        
        Date currentDate = new Date();
        String s = currentDate.toString();
        
        System.out.println("Current Date: " + s);
        
    }
    
}
