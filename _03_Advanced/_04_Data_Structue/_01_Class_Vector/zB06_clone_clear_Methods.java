package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_clone_clear_Methods {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        v.add("A");
        v.add("B");
        v.add("C");
        
        Object o = v.clone();
        
        v.clear();
        
        System.out.println("v = " + v);
        System.out.println("o = " + o);
        
    }
    
}
