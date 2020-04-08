package _02_OOP._11_Nested_Classes.zB04_Static_Nested_Classes;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        A.B obj = new A.B();
        
        obj.x = 10;
        obj.printX();
        
        obj.y = 20;
        obj.printY();
        
        A.B.y = 30;
        A.B.printY();
        
    }
    
}
