package _03_Advanced._05_Collection._01_Collection._01_interfaces._06_interface_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_Iterator {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        
        Iterator i = al.iterator();
        
        while (i.hasNext()) {            
            System.out.println(i.next());
        }
        
    }
    
}
