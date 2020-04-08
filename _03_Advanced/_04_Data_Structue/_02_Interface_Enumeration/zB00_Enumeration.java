package _03_Advanced._04_Data_Structue._02_Interface_Enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB00_Enumeration {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        v.add("Monday");
        v.add("Tuesday");
        v.add("Wednesday");
        v.add("Thursday");
        v.add("Friday");
        v.add("Satruday");
        v.add("Sunday");
        
        Enumeration days = v.elements();
        
        while (days.hasMoreElements()) {            
            System.out.println(days.nextElement());
        }
        
    }
    
}
