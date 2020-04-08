package _02_OOP._03_Encapsulation.zB01_getter_setter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Employee e = new Employee();
        
        e.name = "Majd";
        e.age = 29;
        e.salary = 1500000;
        
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Salary: " + e.salary);
        
    }
    
}
