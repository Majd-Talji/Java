package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_clone_Method {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        Object arr = al.clone();

        al.clear();
        
        System.out.println("al = " + al);
        System.out.println("arr = " + arr);
        
    }

}
