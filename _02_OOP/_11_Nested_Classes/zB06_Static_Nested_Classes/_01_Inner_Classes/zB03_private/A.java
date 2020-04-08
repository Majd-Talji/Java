package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._01_Inner_Classes.zB03_private;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class A {
    
    private class B {
        
        public void print() {
            System.out.println("B is a private inner class");
        }
        
    }
    
    public void callPrintB() {
        B b = new B();
        b.print();
    }
    
}
