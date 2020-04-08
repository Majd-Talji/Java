package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._02_Method_Local_Inner_Classes;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class A {
    
    public void displayInnerClass() {
        
        class B {
            void print() {
                System.out.println("B is Local Inner Class");
            }
        }
        
        B b = new B();
        b.print();
        
    }
    
}
