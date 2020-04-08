package _03_Advanced._05_Collection._01_Collection._01_interfaces._07_interface_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_ArrayList_ListIterator_hasPrevious_previous_next_hasNext_Method {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        
        ListIterator li = al.listIterator();
        
        System.out.println("Ascending sort order: ");
        
        while (li.hasNext()) {            
            System.out.print(li.next() + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Descending sort order: ");
        
        while (li.hasPrevious()) {            
            System.out.print(li.previous() + " ");
        }
        
        System.out.println("\n");
        
    }
    
}
