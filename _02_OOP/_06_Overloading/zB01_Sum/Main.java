package _02_OOP._06_Overloading.zB01_Sum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyMethods m = new MyMethods();
        
        m.sum(1000, 4000);
        m.sum(10f, 40f);
        m.sum(10d, 40d);
        
        System.out.println();
        
        m.sum(2000, -100);
        m.sum(5.5, -3.3);
        m.sum(5.5d, -3.3d);
        m.sum(5.5f, -3.3f);
        
        System.out.println();
        
        m.sum(6, 5.25);
        m.sum(6, 5.25f);
        m.sum(6, 5.25d);
        
//        System.out.println(6d + 5.1f);
        
    }
    
}
