package _02_OOP._10_Polymorphism.zB04_Polymorphic_InstanceOf;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A b = new B();
        A c = new C();
        
        check(b);
        check(c);
        
    }
    
    static void check(A obj) {
        if (obj instanceof B) {
            System.out.println("This is an object from the class B");
        } else if (obj instanceof C) {
            System.out.println("This is an object from the class C");
        }
    }
    
}
