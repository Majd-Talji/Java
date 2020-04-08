package _03_Advanced._10_Lambda_Expressions._03_void_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _1_No_Lambda {
    
    public static void main(String[] args) {
        
        Greetings obj = new Greetings() {
            @Override
            public void welcomeUser(String userName) {
                System.out.println("Welcome to " + userName);
            }
        };
        
        obj.welcomeUser("Majd Talji");
        
    }
    
}
