package _02_OOP._07_Type_Casting.zB02_Person;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Female hala = new Female();
        Male muhamad = new Male();
        
        Person ziad = new Male();
        
        Female rola = new Female();
        Person p = rola;
        Female rana = (Female) p;
        
        System.out.println("1) " + hala.toString());
        System.out.println("2) " + muhamad.toString());
        System.out.println("3) " + ziad.toString());
        System.out.println("4) " + rola.toString());
        System.out.println("5) " + p.toString());
        System.out.println("6) " + rana.toString());
        
    }
    
}
