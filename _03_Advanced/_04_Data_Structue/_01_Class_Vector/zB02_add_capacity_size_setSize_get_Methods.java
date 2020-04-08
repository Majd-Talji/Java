package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_add_capacity_size_setSize_get_Methods {
    
    public static void main(String[] args) {
        
        Vector v = new Vector(5);
        
        System.out.println("capacity = " + v.capacity()); 
        System.out.println("v.size() = " + v.size() + "\n");
        
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");       
        
        System.out.println("v.capacity()= " + v.capacity());
        System.out.println("v.size() = " + v.size() + "\n");
        
        v.setSize(12);
        
        System.out.println("v.capacity() = " + v.capacity());
        System.out.println("v.size() = " + v.size() + "\n");
        
        for (int i = 0; i < v.size(); i++) {
            System.out.println("v[" + i + "] = "+ v.get(i));
        }
        
    }
    
}
