package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_add_get_getFirst_getLast_size_indexOf_lastIndexOf_contains {
    
    public static void main(String[] args) {
        
        LinkedList arr = new LinkedList();
        
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("Z");
        
        System.out.println("First element: " + arr.getFirst());
        
        System.out.println("Last element: " + arr.getLast() + "\n");
        
        System.out.println("Element at arr[4]: " + arr); 
        
        System.out.println("First index of the object 'C': " + arr.indexOf("C") + "\n");
        System.out.println("Last index of the object 'C': " + arr.lastIndexOf("C") + "\n");
        
        System.out.println("Does it contain a 'D' object? " + arr.contains("D"));        
        System.out.println("Does it contain a 'F' object? " + arr.contains("F") + "\n");
        
    }
    
}
