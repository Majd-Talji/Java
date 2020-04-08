package _01_Basis._09_Strings._02_Methodes._05_Manipulation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_getChars {
    
    public static void main(String[] args) {
        
        String str = "welcome to Majd Talji";
        char[] arr = new char[10];
        
        str.getChars( 0, 10, arr, 0 );
        
        System.out.println( "Copied Value = " + arr );
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] );
        }
        
        System.out.println();
        
    }
    
}
