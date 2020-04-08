package _02_OOP._08_Abstraction.zB01_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class B extends A{

    @Override
    public void setX(int x) {
        super.x = x;
    }

    @Override
    public int getX() {
        return super.x;
    }
    
}
