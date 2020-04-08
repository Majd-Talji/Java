package _02_OOP._04_Inheritance.zB05_Super_Specific_Constructers_02;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        B b1 = new B();
        System.out.println("Here the constructor generate these values for the object b1: ");
        System.out.println("x: " + b1.x);
        System.out.println("y: " + b1.y);

        System.out.println();

        B b2 = new B(55, 45);
        System.out.println("Here the constructor generate these values for the object b2: ");
        System.out.println("x: " + b2.x);
        System.out.println("y: " + b2.y);

    }

}
