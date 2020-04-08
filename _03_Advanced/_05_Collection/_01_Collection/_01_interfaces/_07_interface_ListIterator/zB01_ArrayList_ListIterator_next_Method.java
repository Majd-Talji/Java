package _03_Advanced._05_Collection._01_Collection._01_interfaces._07_interface_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_ArrayList_ListIterator_next_Method {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        
        ListIterator li = al.listIterator();
        
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        
    }
    
}
