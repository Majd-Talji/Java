package _01_Basis._11_Date_And_Time._02_SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Date {
    
    public static void main(String[] args) {
        
        Date currentDate = new Date();
        System.out.println("Current Date : " + currentDate);
        
        Date specialDate = new Date(5000);
        System.out.println("Special Date : " + specialDate);
        
    }
    
}
