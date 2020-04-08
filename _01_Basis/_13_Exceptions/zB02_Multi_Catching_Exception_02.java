package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Multi_Catching_Exception_02 {
    
    public static void main(String[] args) {
        
        String s = "123456789200002030405555555555551607180925212423";
        int a;
        
        try {
            System.out.println("s.charAt(28): " + s.charAt(28));
            a = Integer.parseInt(s);
        } catch (StringIndexOutOfBoundsException | NumberFormatException e1) {
            System.out.println("The string 's' throw: " + e1);
        } catch (Exception e2) {
            System.out.println("Exception thrown: " + e2);
        } 
        
        System.out.println("The program still work properly");
        
    }
    
}
