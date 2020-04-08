package _02_OOP._04_Inheritance.zB02_Super_Variables;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class B extends A{
    
    public int x = 20;
    
    public void printBoth() {
        System.out.println("x in B contain: " + x);
        System.out.println("x in B contain: " + this.x);
        System.out.println("x in A contain: " + super.x);
    }
    
}
