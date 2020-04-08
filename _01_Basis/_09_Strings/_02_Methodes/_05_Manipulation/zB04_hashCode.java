package _01_Basis._09_Strings._02_Methodes._05_Manipulation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_hashCode {
    
    public static void main(String[] args) {
        
        // Hash Code = s[0]*31^(n-1) + s[0]*31^(n-2) + ... + s[0]*31^(n-1)
        String s = "welcome to Majd Talji";

        System.out.println( "The hascode of s is " + s.hashCode() );
        
    }
    
}
