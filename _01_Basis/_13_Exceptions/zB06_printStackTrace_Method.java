package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_printStackTrace_Method {
    
    public static void main(String[] args) {
        
        String s = "abcd 1234";
        int a;
        
        try {
            a = Integer.parseInt(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
