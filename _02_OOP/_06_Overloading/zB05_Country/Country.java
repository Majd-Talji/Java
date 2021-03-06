package _02_OOP._06_Overloading.zB05_Country;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Country {

    public String name;
    public double area;
    public long population;

    public Country() {

    }

    public Country(String n) {
        name = n;
    }

    public Country(String n, double a) {
        name = n;
        area = a;
    }

    public Country(String n, double a, long p) {
        name = n;
        area = a;
        population = p;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("area: " + area);
        System.out.println("population: " + population);
        System.out.println("-------------------------");
    }

}
