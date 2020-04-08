package _02_OOP._04_Inheritance.zB05_Super_Specific_Constructers_02;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class B extends A{
    
    public B() {
        super(123, 456);
    }
    
    public B(int p1, int p2) {
        super(p1, p2);
    }
    
}
