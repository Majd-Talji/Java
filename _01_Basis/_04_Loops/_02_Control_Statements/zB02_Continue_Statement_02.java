package _01_Basis._04_Loops._02_Control_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Continue_Statement_02 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            
            if ( i % 2 == 0 ) {
                continue;
            }
            
            System.out.println( i );
            
        }
        
    }
    
}
