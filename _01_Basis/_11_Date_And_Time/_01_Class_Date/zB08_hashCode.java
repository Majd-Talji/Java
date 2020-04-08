package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB08_hashCode {
    
    public static void main(String[] args) {
        
        Date currentDate = new Date();
        long hash = currentDate.toString().hashCode();
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Date in hashcode: " + hash);
        
    }
    
}
