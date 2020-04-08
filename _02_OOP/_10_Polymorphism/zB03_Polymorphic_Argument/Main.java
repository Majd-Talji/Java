package _02_OOP._10_Polymorphism.zB03_Polymorphic_Argument;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Shape s = new Square();
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape c = new Circle();
        
        Drawer drawer = new Drawer();
        
        drawer.draw(s);
        drawer.draw(r);
        drawer.draw(t);
        drawer.draw(c);
        
    }
    
}
