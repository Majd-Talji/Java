package _03_Advanced._10_Lambda_Expressions._01_void_no_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _1_No_Lambda {
    
    public static void main(String[] args) {
        
        Greetings obj = new Greetings() {
            @Override
            public void welcomeMessage() {
                System.out.println("Welcome to Majd Talji");
            }
        };
        
        obj.welcomeMessage();
        
    }
    
}
