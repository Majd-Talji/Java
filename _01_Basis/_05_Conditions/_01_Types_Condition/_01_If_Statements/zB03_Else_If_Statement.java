package _01_Basis._05_Conditions._01_Types_Condition._01_If_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_Else_If_Statement {

    public static void main(String[] args) {

        int number = 3;

        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number >= 4) {
            System.out.println("four or greater");
        } else {
            System.out.println("negative number");
        }

    }

}
