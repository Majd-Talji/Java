package _02_OOP._08_Abstraction.zB03_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Employee extends Person{
    
    String workPlace;

    public Employee(String name, String gender, String birthday, boolean isMarried, String workPlace) {
        super(name, gender, birthday, isMarried);
        this.workPlace = workPlace;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        
        if (getIsMarried() == true) {
            System.out.println("is Married: yes");
        } else {
            System.out.println("is Married: no");
        }
        
        System.out.println("Work place: " + workPlace);
        System.out.println("---------------------------------");        
    }
    
}
