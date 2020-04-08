package _02_OOP._01_Class_Object;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Person {
    
    String name;
    String sex;
    String job;
    int age;
    
    public Person() {
        
    }
    
    public Person(String name, String sex, String job, int age) {
        this.name = name;
        this.sex = sex;
        this.job = job;
        this.age = age;
    }
    
    void printInfo() {
        System.out.println("Name: "  + name);
        System.out.println("Sex: " + sex);
        System.out.println("Job: " + job);
        System.out.println("Age: " + age);
        System.out.println();
    }
    
}
