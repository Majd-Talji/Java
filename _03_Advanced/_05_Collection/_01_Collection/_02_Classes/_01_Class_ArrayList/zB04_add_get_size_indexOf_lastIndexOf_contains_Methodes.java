package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_add_get_size_indexOf_lastIndexOf_contains_Methodes {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("Z");
        
        System.out.println("First element: " + al.get(0));
        
        System.out.println("Last element: " + al.get(al.size() - 1) + "\n");
        
        System.out.println("Element at al[4]: " + al.get(4) + "\n");
        
        System.out.println("First index of the object 'C': " + al.indexOf("C"));
        System.out.println("Last index of the object 'C': " + al.lastIndexOf("C") + "\n");
                
        System.out.println("Does it contain a 'D' object? " + al.contains("D"));
        System.out.println("Does it contain a 'F' object? " + al.contains("F"));
        
    }
    
}
