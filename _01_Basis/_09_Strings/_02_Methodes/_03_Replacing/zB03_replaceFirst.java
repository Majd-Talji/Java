package _01_Basis._09_Strings._02_Methodes._03_Replacing;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_replaceFirst {
    
    public static void main(String[] args) {
        
        String str = "Majd Talji 1 2 3";
        
        System.out.println( str.replaceFirst(" ", "-") );
        
        String strWithOutNumbers = str.replaceFirst("[0-9]+", "");
        System.out.println( strWithOutNumbers );
        
        String strOnlyNumbers = str.replaceFirst("[a-zA-Z]+", "");
        System.out.println( strOnlyNumbers );
        
    }
    
}
