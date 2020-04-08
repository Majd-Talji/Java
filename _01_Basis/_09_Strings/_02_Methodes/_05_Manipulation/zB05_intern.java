package _01_Basis._09_Strings._02_Methodes._05_Manipulation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_intern {
    
    public static void main(String[] args) {
        
        String s1 = "welcome to Majd Talji";
        String s2 = new String("welcome to Majd Talji");
        
        System.out.println( s1 == s2 );
        System.out.println( s1 == s2.intern() );
        
    }
    
}
