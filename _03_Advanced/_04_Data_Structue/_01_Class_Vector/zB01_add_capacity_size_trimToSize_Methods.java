package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_add_capacity_size_trimToSize_Methods {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        System.out.println("capacity = " + v.capacity()); 
        System.out.println("v.size() = " + v.size() + "\n");
        
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");
        v.add("G");
        v.add("H");
        v.add("I");
        v.add("J");
        v.add("K");        
        
        System.out.println("v.capacity()= " + v.capacity());
        System.out.println("v.size() = " + v.size() + "\n");
        
        v.trimToSize();
        
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v.size() = " + v.size());
        
    }
    
}
