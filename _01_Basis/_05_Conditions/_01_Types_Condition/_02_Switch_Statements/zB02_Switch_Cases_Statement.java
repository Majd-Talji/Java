package _01_Basis._05_Conditions._01_Types_Condition._02_Switch_Statements;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Switch_Cases_Statement {

    public static void main(String[] args) {

        int x = 3;

        switch (x) {

            case 1:
            case 2:
            case 3:
                System.out.println("x contain 1 or 2 or 3");
                break;

            default:
                System.out.println("x contain a different value");

        }

    }

}
