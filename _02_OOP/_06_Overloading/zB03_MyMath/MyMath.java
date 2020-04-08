package _02_OOP._06_Overloading.zB03_MyMath;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyMath {
    
    public double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }        
    }
    
    public double max(double a, double b, double c) {
        if (max(a, b) > c) {
            return max(a, b);
        } else {
            return c;
        }
    }
    
    public double max(double a, double b, double c, double d) {
        if (max(a, b, c) > d) {
            return max(a, b, c);
        } else {
            return d;
        }
    }
    
}
