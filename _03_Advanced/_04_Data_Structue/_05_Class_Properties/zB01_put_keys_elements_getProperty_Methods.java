package _03_Advanced._04_Data_Structue._05_Class_Properties;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_put_keys_elements_getProperty_Methods {
    
    public static void main(String[] args) {
        
        Properties p = new Properties();
        
        p.put("+961", "Lebanon");
        p.put("+962", "Jordan");
        p.put("+963", "Syria");
        p.put("+964", "Iraq");
        p.put("+965", "Kuwait");
        p.put("+966", "KSA");
        p.put("+967", "Yaman");
        p.put("+968", "Oman");
        p.put("+212", "Morocco");
        p.put("+281", "Libya");
        p.put("+20", "Egypt");
        
        Enumeration keys = p.keys();
        
        Enumeration values = p.elements();
        
        System.out.println("The table below contains all Codes & Countries \n");
        System.out.println("---------------------");
        System.out.println("Code \t | Country");
        System.out.println("---------------------");
        
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement() + "\t | " + values.nextElement());
        }       
        System.out.println("---------------------\n");
        
        System.out.println("Which Country use the code +966?");
        System.out.println(p.getProperty("+966", "Code not found!"));
        
        System.out.println();
        System.out.println("Which Country use the code +123?");
        System.out.println(p.getProperty("+123", "Code not found!"));
        
    }
    
}
