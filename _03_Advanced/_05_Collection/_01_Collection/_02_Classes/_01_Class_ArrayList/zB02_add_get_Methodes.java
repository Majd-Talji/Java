package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_add_get_Methodes {
    
    public static void main(String[] args) {
        
        ArrayList arr1 = new ArrayList();
        
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        
        ArrayList arr2 = new ArrayList();
        
        arr2.add(arr1);
        
        System.out.println("arr2 element:        " + arr2.get(0) + "\n");
        System.out.println("Number of elements in arr2: " + arr2.size() + "\n");
        
    }
    
}
