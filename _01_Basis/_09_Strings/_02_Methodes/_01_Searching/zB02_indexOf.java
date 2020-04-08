package _01_Basis._09_Strings._02_Methodes._01_Searching;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_indexOf {
    
    public static void main(String[] args) {
        
        String Str = "Welcome to github.com/Majd-Talji, Majd is one of the best site for learing.";
        String subStr = "Majd";
        
        System.out.println( Str.indexOf('a') );
        System.out.println( Str.indexOf('a', 25));
        
        System.out.println( Str.indexOf(subStr) );
        System.out.println( Str.indexOf(subStr, 26));
        
        System.out.println( Str.indexOf('x') );
        System.out.println( Str.indexOf('@') );
        System.out.println( Str.indexOf("hello") );
        
    }
    
}
