package _03_Advanced._10_Lambda_Expressions._04_return_Value_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _1_No_Lambda {
    
    public static void main(String[] args) {
        
        Greetings obj = new Greetings() {
            @Override
            public String welcomeUser(String userName) {
                return "Welcome to " + userName;
            }
        };
        
        System.out.println(obj.welcomeUser("Majd Talji"));
        
    }
    
}
