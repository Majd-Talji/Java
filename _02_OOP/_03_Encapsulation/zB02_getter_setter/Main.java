package _02_OOP._03_Encapsulation.zB02_getter_setter;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Employee e = new Employee();
        
        e.setName("Majd");
        e.setAge(29);
        e.setSalary(1500000);
        
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
        
    }
    
}
