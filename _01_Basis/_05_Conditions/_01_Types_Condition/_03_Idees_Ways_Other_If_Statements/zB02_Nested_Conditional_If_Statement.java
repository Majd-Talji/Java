package _01_Basis._05_Conditions._01_Types_Condition._03_Idees_Ways_Other_If_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Nested_Conditional_If_Statement {

    public static void main(String[] args) {

        String sex = "female";
        int age = 14;

        if (sex == "male") {
            System.out.println("Gender: male");
            if (age <= 21) {
                System.out.println("He is a young boy.");
            }
        } else if (sex == "female") {
            System.out.println("Gender: female");
            if (age <= 21) {
                System.out.println("She is a young girl.");
            }
        }

    }

}
