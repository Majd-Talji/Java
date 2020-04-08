package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._01_Inner_Classes.zB01_Default;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A a = new A();
        A.B b = a.new B();
        
        A.B bb = new A().new B();
        
    }
    
}
