package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_regionMatches {
    
    public static void main(String[] args) {
        
        String s1 = "welcome to Majd";
        String s2 = "Majd";
        String s3 = "MAJD";
        
        System.out.println( s1.regionMatches(11, s2, 0, 4) );
        System.out.println( s1.regionMatches(11, s3, 0, 4) );
        System.out.println( s1.regionMatches(true, 11, s3, 0, 4) );
        
    }
    
}
