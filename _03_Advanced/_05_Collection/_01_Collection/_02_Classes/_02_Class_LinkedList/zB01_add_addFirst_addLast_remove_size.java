package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_add_addFirst_addLast_remove_size {
    
    public static void main(String[] args) {
        
        LinkedList arr = new LinkedList();
        
        System.out.println("All elements: " + arr);        
        System.out.println("Number of elements: " + arr.size() + "\n");
        
        arr.add("A");
        arr.add("C");
        arr.add("E");
        arr.add(2,"D");
        arr.addFirst("A");
        arr.addLast("F");
        
        System.out.println("All elements: " + arr);        
        System.out.println("Number of elements: " + arr.size() + "\n");
        
        arr.remove();
        arr.remove(2);
        arr.remove("B");
        
        System.out.println("All elements: " + arr);        
        System.out.println("Number of elements: " + arr.size() + "\n");
        
    }
    
}
