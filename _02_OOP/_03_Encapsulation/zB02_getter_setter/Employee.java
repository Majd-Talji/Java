package _02_OOP._03_Encapsulation.zB02_getter_setter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
