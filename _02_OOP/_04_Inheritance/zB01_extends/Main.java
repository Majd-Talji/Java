package _02_OOP._04_Inheritance.zB01_extends;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        B b = new B();
        
        b.printA();
        
        b.x = 1234;
        System.out.println("x: " + b.x);
        
    }
    
}
