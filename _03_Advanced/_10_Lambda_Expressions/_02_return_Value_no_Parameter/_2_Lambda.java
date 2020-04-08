package _03_Advanced._10_Lambda_Expressions._02_return_Value_no_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _2_Lambda {

    public static void main(String[] args) {

        Greetings obj = () -> {
                return "Welcome to Majd Talji.";
        };
        
        System.out.println(obj.getMessage());

    }

}
