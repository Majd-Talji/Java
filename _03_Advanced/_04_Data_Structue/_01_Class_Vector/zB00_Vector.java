package _03_Advanced._04_Data_Structue._01_Class_Vector;

import java.util.Vector;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB00_Vector {
    
    public static void main(String[] args) {
        
        Vector v1 = new Vector();
        Vector v2 = new Vector(10);
        Vector v3 = new Vector(10, 13);
        Vector v4 = new Vector(v3);
        
        v1.add(1200);
        System.out.println("v1.add(1205) : " + v1.add(1205));
        System.out.println("v2.addAll(v1) : " + v2.addAll(v1));
        System.out.println("v1.addAll(1, v1) : " + v1.addAll(1, v1));
        v1.addElement(1254);
        System.out.println("v1.capacity() : " + v1.capacity());
        v2.clear();
        System.out.println("v1.clone() : " + v1.clone());
        System.out.println("v1.contains(1200) : " + v1.contains(1200) + "; v1.contains(12001) : " + v1.contains(12001));
        v3.add(1900);
        System.out.println("v1.containsAll(v3) : " + v1.containsAll(v3));
        System.out.println("v1.remove(\"14587\") : " + v1.remove("14587"));
        System.out.println("v1.capacity() : " + v1.capacity());
        v1.trimToSize();
        System.out.println("" + v1.add(45006));
        v1.trimToSize();
        System.out.println("v1.capacity() : " + v1.capacity());
        System.out.println(" : " + v1);
        System.out.println(" : " + v1);
        
    }
    
}
