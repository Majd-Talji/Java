package _01_Basis._08_Characters._03_Character_Methods;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_isWhitespace {
    
    public static void main(String[] args) {
        
        System.out.println( Character.isWhitespace('a') );
        System.out.println( Character.isWhitespace('#') );
        System.out.println( Character.isWhitespace('1') );
        System.out.println( Character.isWhitespace(' ') );
        System.out.println( Character.isWhitespace('\t') );
        System.out.println( Character.isWhitespace('\n') );        
        
    }
    
}
