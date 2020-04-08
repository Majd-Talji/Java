package _02_OOP._06_Overloading.zB02_Infomation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyInfo m = new MyInfo();
        
        m.displayInfo("Majd");
        m.displayInfo("Majd", "Talji");
        m.displayInfo("Majd", "Talji", "programmer");
        
    }
    
}
