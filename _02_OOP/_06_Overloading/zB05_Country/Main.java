package _02_OOP._06_Overloading.zB05_Country;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Country c1 = new Country();
        Country c2 = new Country("KSA");
        Country c3 = new Country("Turkey", 780580);
        Country c4 = new Country("Lebanon", 10452, 4467000);
        
        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();
        
    }
    
}
