package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_endsWith {
    
    public static void main(String[] args) {
        
        String str = "Welcome to Majd Talji.";
        
        System.out.println( str.endsWith("Talji.") );
        System.out.println( str.endsWith("Talji") );
        System.out.println( str.endsWith("") );
        
    }
    
}
