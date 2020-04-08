package _03_Advanced._06_Generics._02_Generics_Class;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Box <T> {
    
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
}
