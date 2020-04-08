package _02_OOP._08_Abstraction.zB03_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student s = new Student("Majd", "Male", "1991", true, "Computer Science");
        s.displayInfo();
        
        Employee e = new Employee("Rola", "Female", "1995", false, "Al-Iman school");
        e.displayInfo();
        
    }
    
}
