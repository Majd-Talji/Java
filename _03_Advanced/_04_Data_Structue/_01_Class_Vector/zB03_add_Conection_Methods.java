package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_add_Conection_Methods {
    
    public static void main(String[] args) {
        
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        
        System.out.println("capacity = " + v1.capacity()); 
        System.out.println("v2.size() = " + v1.size() + "\n");
        
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");       
        
        System.out.println("v1.size()= " + v1.size());
        System.out.println("v2.size() = " + v2.size() + "\n");
        
        v2.add(v1);
                
        System.out.println("v1.size() = " + v1.size());
        System.out.println("v2.size() = " + v2.size() + "\n");
        
        System.out.println("v2[0] = " + v2.get(0));
        
    }
    
}
