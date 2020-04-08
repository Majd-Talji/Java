package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_Constructor_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList arr1 = new ArrayList();
        
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        
        ArrayList arr2 = new ArrayList(arr1);
        
        arr2.add("F");
        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }
        
        System.out.println("arr1 elements: " + arr1);
        System.out.println("arr2 elements: " + arr2 + "\n");
        
    }
    
}
