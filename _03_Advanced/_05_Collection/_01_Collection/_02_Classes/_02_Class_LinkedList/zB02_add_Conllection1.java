package _03_Advanced._05_Collection._01_Collection._02_Classes._02_Class_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_add_Conllection1 {

    public static void main(String[] args) {

        LinkedList arr = new LinkedList();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");

        Object o = arr.clone();

        arr.clear();

        System.out.println("arr = " + arr);
        System.out.println("o = " + o);

    }

}
