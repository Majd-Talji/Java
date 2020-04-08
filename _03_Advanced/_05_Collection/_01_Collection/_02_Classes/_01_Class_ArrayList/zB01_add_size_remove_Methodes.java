package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_add_size_remove_Methodes {
    
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        System.out.println("All element:        " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        
        System.out.println("All element:        " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
        
        al.remove("B");
        al.remove(1);
        
        System.out.println("All element:        " + al);
        System.out.println("Number of elements: " + al.size() + "\n");
        
    }
    
}
