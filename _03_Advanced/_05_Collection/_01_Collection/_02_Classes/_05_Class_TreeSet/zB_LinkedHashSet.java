package _03_Advanced._05_Collection._01_Collection._02_Classes._05_Class_TreeSet;

import java.util.TreeSet;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_LinkedHashSet {
    
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();
        
        ts.add(4);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(1);
        
        System.out.println("All elements : " + ts);
        
        System.out.println("First element: " + ts.first());
        
        System.out.println("Last element: " + ts.last());
        
        System.out.println("headSet(3) : " + ts.headSet(3));
        
        System.out.println("tailSet(3) : " + ts.tailSet(3));
        
        System.out.println("Subset(1, 4) : " + ts.subSet(1, 4));
        
        System.out.println("Comparator() : " + ts.comparator());
        
    }
    
}
