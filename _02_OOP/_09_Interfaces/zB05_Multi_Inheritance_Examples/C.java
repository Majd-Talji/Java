package _02_OOP._09_Interfaces.zB05_Multi_Inheritance_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class C extends B implements A{

    @Override
    public void printA() {
        System.out.println("C should Override the method printA()");
    }
    
}
