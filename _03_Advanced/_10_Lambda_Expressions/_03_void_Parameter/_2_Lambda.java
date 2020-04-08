package _03_Advanced._10_Lambda_Expressions._03_void_Parameter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _2_Lambda {

    public static void main(String[] args) {

        Greetings obj = (userName) -> {
            System.out.println("Welcome to " + userName);
        };

        obj.welcomeUser("Majd Talji");

    }

}
