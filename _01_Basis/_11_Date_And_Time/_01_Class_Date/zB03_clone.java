package _01_Basis._11_Date_And_Time._01_Class_Date;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_clone {
    
    public static void main(String[] args) {
        
        Date date1 = new Date();
        
        Object date2 = date1.clone();
        
        System.out.println("Original Date : " + date1);
        System.out.println("Cloned   Date : " + date2);
        
    }
    
}
