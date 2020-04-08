package _01_Basis._11_Date_And_Time._02_SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_SimpleDateFormat {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("E MMM d hh:mm:ss zzz Y");
        
        System.out.println(date);
        System.out.println(sdf.format(date));
        
    }
    
}
