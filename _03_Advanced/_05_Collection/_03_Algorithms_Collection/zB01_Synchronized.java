package _03_Advanced._05_Collection._03_Algorithms_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Synchronized {

    public static void main(String[] args) {

        List al = Collections.synchronizedList(new ArrayList());
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        
        synchronized(al) {
            
            Iterator i = al.iterator();
            
            while (i.hasNext()) {                
                System.out.println(i.next());
            }
            
        }

    }

}
