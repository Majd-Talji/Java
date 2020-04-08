package _03_Advanced._05_Collection._01_Collection._01_interfaces._03_interface_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Set {
    
    public static void main(String[] args) {
                
        TreeSet o1 = new TreeSet();        
        o1.add(1);
        o1.add(2);
        o1.add(3);
        
        HashSet o2 = new HashSet();        
        o2.add(4);
        o2.add(5);
        o2.add(6);
        
        LinkedHashSet o3 = new LinkedHashSet();
        o3.add(7);
        o3.add(8);
        o3.add(9);
        
        System.out.println("TreeSet elements:     " + o1);
        System.out.println("HashSet elements:    " + o2);
        System.out.println("LinkedHashSet elements: " + o3);
        
    }
    
}
