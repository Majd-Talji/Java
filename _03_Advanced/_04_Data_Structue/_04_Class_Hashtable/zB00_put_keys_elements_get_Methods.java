package _03_Advanced._04_Data_Structue._04_Class_Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB00_put_keys_elements_get_Methods {
    
    public static void main(String[] args) {
        
        Hashtable h = new Hashtable();
        
        h.put("+961", "Lebanon");
        h.put("+962", "Jordan");
        h.put("+963", "Syria");
        h.put("+964", "Iraq");
        h.put("+965", "Kuwait");
        h.put("+966", "KSA");
        h.put("+967", "Yaman");
        h.put("+968", "Oman");
        h.put("+212", "Morocco");
        h.put("+281", "Libya");
        h.put("+20", "Egypt");
        
        Enumeration keys = h.keys();
        
        Enumeration values = h.elements();
        
        System.out.println("The table below contains all Codes & Countries \n");
        System.out.println("---------------------");
        System.out.println("Code \t | Country");
        System.out.println("---------------------");
        
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement() + "\t | " + values.nextElement());
        }       
        System.out.println("---------------------\n");
        
        System.out.println("Which Country use the code +966");
        System.out.println(h.get("+966"));
        
    }
    
}
