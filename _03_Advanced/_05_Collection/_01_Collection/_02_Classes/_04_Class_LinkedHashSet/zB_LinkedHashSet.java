package _03_Advanced._05_Collection._01_Collection._02_Classes._04_Class_LinkedHashSet;

import java.util.LinkedHashSet;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_LinkedHashSet {
    
    public static void main(String[] args) {
        
        LinkedHashSet hs = new LinkedHashSet();
        
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        
        System.out.println("All elements: " + hs + "\n");        
        System.out.println("Number of elements: " + hs.size() + "\n");
        
    }
    
}
