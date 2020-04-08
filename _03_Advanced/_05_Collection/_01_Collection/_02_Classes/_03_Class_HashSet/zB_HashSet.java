package _03_Advanced._05_Collection._01_Collection._02_Classes._03_Class_HashSet;

import java.util.HashSet;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB_HashSet {
    
    public static void main(String[] args) {
        
        HashSet hs = new HashSet();
        
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
