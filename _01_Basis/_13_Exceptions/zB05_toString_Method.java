package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_toString_Method {
    
    public static void main(String[] args) {
        
        String s = "abcd 1234";
        int a;
        
        try {
            a = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
}
