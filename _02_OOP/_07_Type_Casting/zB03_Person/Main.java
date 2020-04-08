package _02_OOP._07_Type_Casting.zB03_Person;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Female hala = new Female();
        Male muhamad = new Male();

        Person ziad = new Male();

        Female rola = new Female();
        Person p = rola;
        Female rana = (Female) p;

        hala.print();
        muhamad.print();
        ziad.print();
        rola.print();
        p.print();
        rana.print();

    }

}
