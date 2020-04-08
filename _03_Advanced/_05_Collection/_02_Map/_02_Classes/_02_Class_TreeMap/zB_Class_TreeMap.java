package _03_Advanced._05_Collection._02_Map._02_Classes._02_Class_TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Class_TreeMap {
    
    public static void main(String[] args) {
        
        TreeMap lhm = new TreeMap();
        
        lhm.put("+961", "Lebanon");
        lhm.put("+962", "Jordan");
        lhm.put("+963", "Syria");
        lhm.put("+964", "Iraq");
        lhm.put("+965", "Kuwait");
        lhm.put("+966", "KSA");
        lhm.put("+967", "Yaman");
        lhm.put("+968", "Oman");
        lhm.put("+970", "Palestine");
        lhm.put("+212", "Morocco");
        lhm.put("+281", "Libya");
        lhm.put("+20", "Eqypt");
        
        Iterator keys = lhm.keySet().iterator();
        
        Iterator values = lhm.values().iterator();
        
        System.out.println("The table below contains all Codes & Countries \n");
        System.out.println("------------------------");
        System.out.println("Code \t | Country");
        System.out.println("------------------------");
        
        while (keys.hasNext()) {            
            System.out.println(keys.next() + "\t | " + values.next());
        }
        System.out.println("------------------------\n");
        
        System.out.println("Which Country use the code +966 ?");
        System.out.println(lhm.get("+966"));
        
    }
    
}
