package _02_OOP._03_Encapsulation.zB03_getter_setter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return "Name : " + name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("Name is too short, name can't be less then 3 characters!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
