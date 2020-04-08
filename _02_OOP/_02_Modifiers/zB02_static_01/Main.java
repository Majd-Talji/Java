package _02_OOP._02_Modifiers.zB02_static_01;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Example e1 = new Example();
        Example e2 = new Example();
        
        Example.a = 10;
        Example.staticPrint();
        e1.staticPrint();
        e2.staticPrint();
        
        e1.a = 23;
        e1.print();
        
        e2.a = 75;
        e2.print();
        
    }
    
}
