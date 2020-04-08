package _03_Advanced._05_Collection._01_Collection._01_interfaces._02_interface_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_List {
    
    public static void main(String[] args) {
        
        
        
        Vector o1 = new Vector();        
        o1.add("A");
        o1.add("B");
        o1.add("C");
        
        ArrayList o2 = new ArrayList();        
        o2.add("A");
        o2.add("B");
        o2.add("C");
        
        LinkedList o3 = new LinkedList();
        o3.add("A");
        o3.add("B");
        o3.add("C");
        
        System.out.println("Vector elements:     " + o1);
        System.out.println("ArrayList elements:    " + o2);
        System.out.println("LinkedList elements: " + o3);
        
    }
    
}
