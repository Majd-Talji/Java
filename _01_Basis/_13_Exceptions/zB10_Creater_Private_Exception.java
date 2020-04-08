package _01_Basis._13_Exceptions;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */

class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }

}

public class zB10_Creater_Private_Exception {

    public static void checkAge(int age) throws MyException {

        if (age < 13) {
            throw new MyException("you can't watch horrer");
        } else {
            System.out.println("you can watch the movie");
        }

    }

    public static void main(String[] args) {
        
        try {
            checkAge(20);
            checkAge(18);
            checkAge(10);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

}


