package _02_OOP._02_Modifiers.zB03_final_04;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Student {
    
    public String name;
    public String specialisation;
    
    public final int id;
    private static int studentsCounter;

    public Student(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;
        
        studentsCounter++;
        id = studentsCounter;
    }
    
    public void printStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialization: " + specialisation);
        System.out.println("---------------------------------");
    }
    
    public static void printTotalNumberOfStudents() {
        System.out.println("The Total number of Student is: " + studentsCounter);
    }
    
}
