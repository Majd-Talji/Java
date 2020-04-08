package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._01_Inner_Classes.zB02_Public;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A.B obj = new A().new B();
        
        obj.print();
        
    }
    
}
