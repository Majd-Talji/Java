package _03_Advanced._05_Collection._02_Map._01_interfaces._02_interface_SortMap;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Interface_SortedMap {
    
    public static void main(String[] args) {
        
        SortedMap sm = new TreeMap();
        sm.put(11, "Ayoub");
        sm.put(7, "Salem");
        sm.put(3, "Rayan");
        sm.put(15, "Salman");
        sm.put(1, "Mona");
        sm.put(2, "Rima");
        sm.put(6, "Hana");
        
        System.out.println("All keys/values : " + sm);        
        
        System.out.println("sm.headMap(8) : " + sm.headMap(8));
        
        System.out.println("tailMap(8) : " + sm.tailMap(8));

        System.out.println("subMap(1, 10) : " + sm.subMap(1, 10));

        System.out.println("First key : " + sm.firstKey());

        System.out.println("Last key : " + sm.lastKey());

        System.out.println("Comparator() : " + sm.comparator());
        
    }
    
}
