package _02_OOP._01_Class_Object;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Muhammad", "Male", "Programmer", 22);
        Person p2 = new Person("Rose", "Female", "Secretary", 23);
        Person p3 = new Person("Ahmad", "Male", "Doctor", 35);
        Person p4 = new Person("Rabih", "Male", "Engineer", 28);
        
        Person p5 = new Person();
        
        p5.name = "Lina";
        p5.sex = "Female";
        p5.job = "Graphic Designer";
        p5.age = 25;
        
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
        p5.printInfo();
        
    }
    
}
