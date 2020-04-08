package _03_Advanced._05_Collection._02_Map._01_interfaces._01_interface_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Interface_Map {
    
    public static void main(String[] args) {
        
        Map m1 = new TreeMap();
        m1.put(1, "Ayoub");
        m1.put(2, "Salem");
        m1.put(3, "Rayan");
        
        Map m2 = new HashMap();
        m2.put(1, "Mona");
        m2.put(2, "Rima");
        m2.put(3, "Hana");
        
        Map m3 = new LinkedHashMap();
        m3.put(1, "Mona");
        m3.put(2, "Rima");
        m3.put(3, "Hana");
        
        System.out.println("TreeMap keys/values : " + m1);
        System.out.println("HashMap keys/values : " + m2);
        System.out.println("LinkedHashMap keys/values : " + m3);
        
    }
    
}
