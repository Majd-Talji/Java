package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_add_Conllection {
    
    public static void main(String[] args) {
        
        LinkedList arr1 = new LinkedList();
        
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        
        LinkedList arr2 = new LinkedList(arr1);
        
        arr2.add("F");
        
        System.out.println("arr1 elements: " + arr1);        
        System.out.println("arr2 elements: " + arr2);
        
    }
    
}
