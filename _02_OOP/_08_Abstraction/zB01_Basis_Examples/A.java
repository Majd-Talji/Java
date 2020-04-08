package _02_OOP._08_Abstraction.zB01_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public abstract class A {
    
    int x;
    
    public void print() {
        System.out.println("This is just an example");
    }
    
    public abstract void setX(int x);
    
    public abstract int getX();
    
}
