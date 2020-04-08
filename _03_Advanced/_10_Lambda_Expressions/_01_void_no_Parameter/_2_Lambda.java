package _03_Advanced._10_Lambda_Expressions._01_void_no_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _2_Lambda {

    public static void main(String[] args) {

        Greetings obj = () -> {
            System.out.println("Welcome to Majd Talji");
        };

        obj.welcomeMessage();

    }

}
