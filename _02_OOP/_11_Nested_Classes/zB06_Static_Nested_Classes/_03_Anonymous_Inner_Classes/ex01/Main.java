package _02_OOP._11_Nested_Classes.zB06_Static_Nested_Classes._03_Anonymous_Inner_Classes.ex01;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Anonymous obj = new Anonymous() {
            @Override
            public void print() {
                System.out.println("Anonymous Inner Class is called");
            }
        };
        
        obj.print();
        
    }
    
}
