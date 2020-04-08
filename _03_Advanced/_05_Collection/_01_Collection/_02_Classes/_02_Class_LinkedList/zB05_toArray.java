package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_toArray {

    public static void main(String[] args) {

        LinkedList arr1 = new LinkedList();

        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");

        Object[] arr2 = new Object[arr1.size()];

        arr1.toArray(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

    }

}
