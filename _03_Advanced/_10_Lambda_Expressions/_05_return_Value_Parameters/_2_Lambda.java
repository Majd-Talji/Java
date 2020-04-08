package _03_Advanced._10_Lambda_Expressions._05_return_Value_Parameters;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class _2_Lambda {

    public static void main(String[] args) {

        Operations obj = (a, b) -> {
                return a + b;
        };
        
        System.out.println(obj.sum(3, 4));

    }

}
