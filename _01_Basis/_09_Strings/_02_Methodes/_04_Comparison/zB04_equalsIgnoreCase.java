package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_equalsIgnoreCase {
    
    public static void main(String[] args) {
        
        String s1 = "hello my name is Majd Talji";
        String s2 = "HELLO MY NAME IS MAJD TALJI";
        String s3 = s2;
        
        System.out.println( s1.equalsIgnoreCase(s2) );
        
        System.out.println( s2.equalsIgnoreCase(s3) );
        
    }
    
}
