package _02_OOP._02_Modifiers.zB03_final_04;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Majd", "Computer science");
        Student s2 = new Student("Haler", "Computer Science");
        Student s3 = new Student("Marwean", "IT");
        Student s4 = new Student("Salamen", "Telecom");
        
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        s4.printStudentInfo();
        
        Student.printTotalNumberOfStudents();
        
    }
    
}
