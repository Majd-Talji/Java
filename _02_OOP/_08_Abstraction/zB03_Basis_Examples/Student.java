/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02_OOP._08_Abstraction.zB03_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Student extends Person{
    
    String specialization;

    public Student(String name, String gender, String birthday, boolean isMarried, String specialization) {
        super(name, gender, birthday, isMarried);
        this.specialization = specialization;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------------");
    }
    
}
