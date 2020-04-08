package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_copyInto_Method {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        v.add("A");
        v.add("B");
        v.add("C");
        
        Object[] arr = new Object[v.size()];
        
        v.copyInto(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
    }
    
}
