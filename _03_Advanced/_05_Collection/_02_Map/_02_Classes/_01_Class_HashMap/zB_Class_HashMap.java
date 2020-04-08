package _03_Advanced._05_Collection._02_Map._02_Classes._01_Class_HashMap;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Class_HashMap {
    
    public static void main(String[] args) {
        
        HashMap h = new HashMap();
        
        h.put("+961", "Lebanon");
        h.put("+962", "Jordan");
        h.put("+963", "Syria");
        h.put("+964", "Iraq");
        h.put("+965", "Kuwait");
        h.put("+966", "KSA");
        h.put("+967", "Yaman");
        h.put("+968", "Oman");
        h.put("+970", "Palestine");
        h.put("+212", "Morocco");
        h.put("+281", "Libya");
        h.put("+20", "Eqypt");
        
        Iterator keys = h.keySet().iterator();
        
        Iterator values = h.values().iterator();
        
        System.out.println("The table below contains all Codes & Countries \n");
        System.out.println("------------------------");
        System.out.println("Code \t | Country");
        System.out.println("------------------------");
        
        while (keys.hasNext()) {            
            System.out.println(keys.next() + "\t | " + values.next());
        }
        System.out.println("------------------------\n");
        
        System.out.println("Which Country use the code +966 ?");
        System.out.println(h.get("+966"));
        
    }
    
}
