package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_firstElement_lastElement_indexOf_lastIndexOf_elementAt_contains_Methods {
 
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("Z");
        
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement() + "\n");
        
        System.out.println("Element at v[4]: " + v.elementAt(4) + "\n");
        
        System.out.println("First index of the object 'C': " + v.indexOf("C"));
        System.out.println("Last index of the object 'C': " + v.lastIndexOf("C") + "\n");
        
        System.out.println("Does it contain a 'D' object? " + v.contains("D"));
        System.out.println("Does it contain a 'F' object? " + v.contains("F"));
        
    }
    
}
