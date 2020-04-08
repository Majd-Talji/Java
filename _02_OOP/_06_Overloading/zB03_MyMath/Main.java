package _02_OOP._06_Overloading.zB03_MyMath;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyMath m = new MyMath();
        
        System.out.println("The max number is: " + m.max(5, 20));
        System.out.println("The max number is: " + m.max(5, 20, 15));        
        System.out.println("The max number is: " + m.max(5, 20, 15, 30));
        
    }
    
}
