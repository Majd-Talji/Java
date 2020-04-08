package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_throw {
    
    public static void main(String[] args) {
        checkAge(65);
    }
    
    public static void checkAge(int age) {
        
        try {
            if (age > 63) {
                throw new Exception("you are too old");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
