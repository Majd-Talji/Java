package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB07_compareToIgnoreCase {
    
    public static void main(String[] args) {
        
        String s1 = "welcome to majd Talji, one of the best websites for learning";
        String s2 = "welcome to Majd Talji, Amazing Website For Programmers";
        String s3 = s1;
        
        System.out.println( s1.compareToIgnoreCase(s2) );
        System.out.println( s2.compareToIgnoreCase(s1) );
        System.out.println( s1.compareToIgnoreCase(s3) );
        
    }
    
}
