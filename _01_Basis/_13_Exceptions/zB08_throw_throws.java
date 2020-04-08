package _01_Basis._13_Exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB08_throw_throws {
    
    public static void main(String[] args) {
        
        try {
            checkAge(64);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void checkAge (int age) throws Exception{
        if (age > 63) {
            throw new Exception("you are too old!");
        }
    }
    
}
