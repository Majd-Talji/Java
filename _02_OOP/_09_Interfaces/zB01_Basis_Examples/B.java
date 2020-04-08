package _02_OOP._09_Interfaces.zB01_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class B implements A{

    @Override
    public void print() {
        System.out.println("B should Override this method.");
    }
    
}
