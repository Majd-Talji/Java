package _01_Basis._09_Strings._02_Methodes._03_Replacing;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_replace {
    
    public static void main(String[] args) {
        
        String str = "Welcome to Majd Talji com";
        
        System.out.println( str.replace('a', 'X') );
        System.out.println( str.replace(' ', '-') );
        System.out.println( str.replace("com", "net") );
        
    }
    
}
