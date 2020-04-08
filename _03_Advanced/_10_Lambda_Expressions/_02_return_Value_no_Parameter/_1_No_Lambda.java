package _03_Advanced._10_Lambda_Expressions._02_return_Value_no_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _1_No_Lambda {
    
    public static void main(String[] args) {
        
        Greetings obj = new Greetings() {
            @Override
            public String getMessage() {
                return "Welcome to Majd Talji.";
            }
        };
        
        System.out.println(obj.getMessage());
        
    }
    
}
