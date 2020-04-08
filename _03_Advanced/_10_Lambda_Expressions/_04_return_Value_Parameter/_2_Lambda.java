package _03_Advanced._10_Lambda_Expressions._04_return_Value_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _2_Lambda {

    public static void main(String[] args) {

        Greetings obj = (userName) -> {
            return "Welcome to " + userName;
        };

        System.out.println(obj.welcomeUser("Majd Talji"));

    }

}
