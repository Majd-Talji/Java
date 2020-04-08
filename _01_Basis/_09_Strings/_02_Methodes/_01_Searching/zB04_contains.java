package _01_Basis._09_Strings._02_Methodes._01_Searching;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_contains {
    
    public static void main(String[] args) {
        
        String s = "learn java in github.com/Majd-Talji";
        CharSequence cs1 = "java";
        CharSequence cs2 = "c++";
        
        System.out.println( s.contains(cs1) );
        System.out.println( s.contains(cs2) );
        
    }
    
}
