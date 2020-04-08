package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB09_throw_Multi_throws {

    public static void main(String[] args) {

        try {
            checkAge(0);
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

    }

    public static void checkAge(int age) throws ArithmeticException, Exception {

        if (age <= 0) {
            throw new ArithmeticException("This is ArithmeticException");
        } else {
            System.out.println(100 / age);
        }

    }

}
