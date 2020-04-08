package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_compareTo {
    
    public static void main(String[] args) {
        
        String s1 = "welcome to majd Talji, one of the best websites for learning";
        String s2 = "welcome to Majd Talji, amazing website for programmers";
        String s3 = s1;
        
        System.out.println( s1.compareTo(s2) );
        System.out.println( s2.compareTo(s1) );
        System.out.println( s1.compareTo(s3) );
        
    }
    
}
