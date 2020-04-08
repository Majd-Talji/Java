package _01_Basis._05_Conditions._01_Types_Condition._02_Switch_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_Switch_Statement_02 {
    
    public static void main(String[] args) {
        
        int x = 5;
        
        switch ( x ) {
            
            case 1:
                System.out.println("x contain 1");
                break;
                
            case 2:
                System.out.println("x contain 2");
                break;
                
            case 3:
                System.out.println("x contain 3");
                break;
                
            default :
                System.out.println("x contain a different value");
            
        }
        
    }
    
}
