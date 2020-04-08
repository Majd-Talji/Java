package _02_OOP._10_Polymorphism.zB01_Polymorphic_Array_Basis;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        
        A[] list = {a1, a2, a3, a4, a5};
        
        list[1].x = 15;
        
        a2.printX();
        
        list[1].printX();
        
    }
    
}
