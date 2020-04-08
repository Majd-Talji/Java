package _03_Advanced._05_Collection._01_Collection._01_interfaces._05_interface_Comparator;

import java.util.Comparator;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class NumberComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 == null || o2 == null) {
            return 0;
        }

        try {
            double num1 = Double.parseDouble(o1.toString());
            double num2 = Double.parseDouble(o2.toString());

            if (num1 == num2) {
                return 0;
            } else if (num1 > num2) {
                return 1;
            } else {
                return -1;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

}
