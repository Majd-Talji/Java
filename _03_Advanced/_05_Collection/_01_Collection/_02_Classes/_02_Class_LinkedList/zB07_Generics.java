package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_Generics {
    
    public static void main(String[] args) {
        
        LinkedList arr1 = new LinkedList();
        
        LinkedList<String> arr2 = new LinkedList<>();
        
        LinkedList<Integer> arr3 = new LinkedList<>();
                        
        arr1.add(null);
        arr1.add(true);
        arr1.add(1234);
        arr1.add("java");
        arr1.add('A');
        
        arr2.add("A");
        arr2.add("B");
        arr2.add("C");
        
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        
        System.out.println("arr1 : " + arr1);
        
        System.out.println("arr2 : " + arr2);
        
        System.out.println("arr3 : " + arr3);
        
    }
    
}
