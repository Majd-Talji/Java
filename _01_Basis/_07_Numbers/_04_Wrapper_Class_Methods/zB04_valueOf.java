package _01_Basis._07_Numbers._04_Wrapper_Class_Methods;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_valueOf {
    
    public static void main(String[] args) {
        
        Integer a = Integer.valueOf(15);
        
        Integer b = Integer.valueOf("80");
        
        Integer c = Integer.valueOf("80", 16);
        
        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        
    }
    
}
