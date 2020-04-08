package _02_OOP._10_Polymorphism.zB02_Polymorphic_Array;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A b = new B();
        A c = new C();
        
        A[] list = new A[2];
        
        list[0] = b;
        list[1] = c;
        
        for (int i = 0; i < list.length; i++) {
            list[i].print();
        }
        
    }
    
}
