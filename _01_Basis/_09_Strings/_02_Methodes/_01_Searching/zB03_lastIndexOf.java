package _01_Basis._09_Strings._02_Methodes._01_Searching;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_lastIndexOf {
    
    public static void main(String[] args) {
        
        String Str = "Welcome to github.com/Majd-Talji, Majd is one of the best site for learing.";
        String subString = "Majd";
        
        System.out.println( Str.lastIndexOf('a') );
        System.out.println( Str.lastIndexOf('a' ,25) );
        
        System.out.println( Str.lastIndexOf(subString) );
        System.out.println( Str.lastIndexOf(subString, 26) );
        
        System.out.println( Str.lastIndexOf('x') );
        System.out.println( Str.lastIndexOf('@') );
        System.out.println( Str.lastIndexOf("hello") );
        
    }
    
}
