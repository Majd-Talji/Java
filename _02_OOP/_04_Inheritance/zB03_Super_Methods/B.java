package _02_OOP._04_Inheritance.zB03_Super_Methods;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class B extends A{
    
    @Override
    public void print() {
        System.out.println("This is print() method from the class B");
    }
    
    public void printBoth() {
        print();
        this.print();
        super.print();
    }
    
}
