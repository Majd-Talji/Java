package _03_Advanced._05_Collection._01_Collection._01_interfaces._05_interface_Comparator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        NumberComparator nc = new NumberComparator();
        
        System.out.println(nc.compare(20, 10));
        
        System.out.println(nc.compare(10, 20));
        
        System.out.println(nc.compare(20, 20));
        
        System.out.println(nc.compare("java", "c++"));
        
        System.out.println(nc.compare(null, 0));
        
    }

}
