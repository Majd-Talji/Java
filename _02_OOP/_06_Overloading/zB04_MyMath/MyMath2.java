package _02_OOP._06_Overloading.zB04_MyMath;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyMath2 extends MyMath1 {

    public double max(double a, double b, double c) {
        if (max(a, b) > c) {
            return max(a, b);
        } else {
            return c;
        }
    }

}
