package _01_Basis._04_Loops._02_Control_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Break_Statement {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            
            if ( i == 6 ) {
                break;
            }
            
            System.out.println( i );
            
        }
        
    }
    
}
