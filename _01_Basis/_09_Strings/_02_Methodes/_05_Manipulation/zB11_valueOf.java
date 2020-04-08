package _01_Basis._09_Strings._02_Methodes._05_Manipulation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB11_valueOf {
    
    public static void main(String[] args) {
        
        int i = 10;
        double d = 55.92;
        long l = 123456;
        boolean b = true;
        char[] arr = {'j','a','v','a'};
        
        System.out.println( "Return Value   (int)   : " + String.valueOf(i) );
        System.out.println( "Return Value (double)  : " + String.valueOf(d) );
        System.out.println( "Return Value (long)    : " + String.valueOf(l) );
        System.out.println( "Return Value (boolean) : " + String.valueOf(b) );
        System.out.println( "Return Value   (char)  : " + String.valueOf(arr) );
        
    }
    
}
