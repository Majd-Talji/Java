package _01_Basis._09_Strings._02_Methodes._03_Replacing;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_replaceAll {
    
    public static void main(String[] args) {
        
        String str = "1 Welcome 98 to 74 Majd 482 Talji 164 com";
        
        System.out.println( str.replaceAll(" ", "-") );
        
        String strWithOutNumbers = str.replaceAll("[0-9]+", "");
        System.out.println( strWithOutNumbers );
        
        String strOnlyNumbers = str.replaceAll("[a-zA-Z]+", "");
        System.out.println( strOnlyNumbers );
        
    }
    
}
