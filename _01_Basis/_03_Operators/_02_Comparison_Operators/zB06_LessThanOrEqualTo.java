package _01_Basis._03_Operators._02_Comparison_Operators;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_LessThanOrEqualTo {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 5;
        int c = 10;
        
        if ( a <= b ) {
            System.out.println("a <= b");
        }
        
        if ( a <= c ) {
            System.out.println("a <= c");
        }
        
        if ( c <= a) {
            System.out.println("c <= a");
        }
        
    }
    
}
