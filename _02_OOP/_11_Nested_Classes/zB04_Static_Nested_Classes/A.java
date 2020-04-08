package _02_OOP._11_Nested_Classes.zB04_Static_Nested_Classes;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class A { // Outer Class
    
    static class B { // Static Nested Class
        
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
