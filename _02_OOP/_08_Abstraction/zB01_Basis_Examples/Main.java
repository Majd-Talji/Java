package _02_OOP._08_Abstraction.zB01_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        B b = new B();
        
        b.print();
        
//        b.x = 10;
        b.setX(10);
        
//        System.out.println("b.x contain: " + b.x);
        System.out.println("b.x contain: " + b.getX());
        
    }
    
}
