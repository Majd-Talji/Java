package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_startsWith {
    
    public static void main(String[] args) {
        
        String str = "welcome to Majd Talji";
        
        System.out.println( str.startsWith("welcome to") );
        System.out.println( str.startsWith("welc") );
        System.out.println( str.startsWith("Majd") );
        System.out.println( str.startsWith("Majd", 11) );
        System.out.println( str.startsWith("") );
        
        
        
    }
    
}
