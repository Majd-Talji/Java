package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._03_Anonymous_Inner_Classes.ex04;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        new A() {
            @Override
            public void print() {
                System.out.println("obj is an Anonymous Inner Object.");
            }
        }.print();
        
    }
    
}
