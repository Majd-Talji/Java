package _03_Advanced._05_Collection._01_Collection._01_interfaces._01_interface_Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Collection {
    
    public static void main(String[] args) {
        
        Vector o1 = new Vector();        
        o1.add("A");
        o1.add("B");
        o1.add("C");
        
        HashSet o2 = new HashSet();        
        o2.add("A");
        o2.add("B");
        o2.add("C");
        
        LinkedList o3 = new LinkedList();
        o3.add("A");
        o3.add("B");
        o3.add("C");
        
        System.out.println("Vector elements:     " + o1);
        System.out.println("HashSet elements:    " + o2);
        System.out.println("LinkedList elements: " + o3);
        
    }
    
}
