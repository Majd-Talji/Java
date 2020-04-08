package _02_OOP._04_Inheritance.zB04_Super_Default_Constructers_03;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        B b = new B();

        System.out.println("In class B we have: ");
        System.out.println("x: " + b.x);
        System.out.println("y: " + b.y);
        System.out.println("z: " + b.z);

        System.out.println();

        A a = new A();

        System.out.println("In class A we have: ");
        System.out.println("x: " + a.x);
        System.out.println("y: " + a.y);

    }

}
