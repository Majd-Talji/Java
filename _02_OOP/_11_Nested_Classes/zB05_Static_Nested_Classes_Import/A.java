package _02_OOP._11_Nested_Classes.zB05_Static_Nested_Classes_Import;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class A {
    
    static class B {
        
        public int x;
        public static int y;
        
        public void printX() {
            System.out.println("x contain: " + x);
        }
        
        public static void printY() {
            System.out.println("y contain: " + y);
        }
        
    }
    
}
