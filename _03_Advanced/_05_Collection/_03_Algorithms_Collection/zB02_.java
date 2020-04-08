package _03_Advanced._05_Collection._03_Algorithms_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_ {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(4);
        al.add(9);
        al.add(-5);
        al.add(-2);
        al.add(7);

        System.out.println("List values:            " + al);

        Collections.sort(al);
        System.out.println("List sorted:            " + al);

        Comparator r = Collections.reverseOrder();
        Collections.sort(al, r);
        System.out.println("List sorted in reverse: " + al);
        
        Collections.shuffle(al);
        System.out.println("List shuffled once:     " + al);
        
        Collections.shuffle(al, new Random(5));
        System.out.println("List shuffled 5 times:  " + al);
        
        System.out.println("List minimum value:     " + Collections.min(al));
        System.out.println("List maximum value:     " + Collections.max(al));

    }

}
