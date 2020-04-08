package _01_Basis._09_Strings._02_Methodes._04_Comparison;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_contentEquals {
    
    public static void main(String[] args) {
        
        String s = "welcome to Majd Talji";
        
        StringBuffer sb1 = new StringBuffer("welcome to Majd Talji");
        System.out.println( s.contentEquals(sb1) );
        
        StringBuffer sb2 = new StringBuffer("welcome to Java world");
        System.out.println( s.contentEquals(sb2) );
        
    }
    
}
