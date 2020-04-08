package _01_Basis._11_Date_And_Time._02_SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_SimpleDateFormat {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("'Current Date:' dd/MM/yy  'Current Time:' hh:mm:ss a");
        
        System.out.println(sdf.format(date));
        
    }
    
}
