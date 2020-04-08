package _03_Advanced._05_Collection._01_Collection._02_Classes._01_Class_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_toArray_Method {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        Object[] arr = new Object[al.size()];

        al.toArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

}
