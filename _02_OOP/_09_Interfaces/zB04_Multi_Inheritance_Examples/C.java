package _02_OOP._09_Interfaces.zB04_Multi_Inheritance_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class C implements B{

    @Override
    public void printA() {
        System.out.println("C should Override the method printA()");
    }

    @Override
    public void printB() {
        System.out.println("C should Override the method printB()");
    }
    
}
