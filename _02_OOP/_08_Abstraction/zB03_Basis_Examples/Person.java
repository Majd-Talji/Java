package _02_OOP._08_Abstraction.zB03_Basis_Examples;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public abstract class Person {
    
    private String name;
    private String gender;
    private String birthday;
    private boolean isMarried;

    public Person(String name, String gender, String birthday, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }
    
    public boolean getIsMarried() {
        return isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    
    public abstract void displayInfo();
    
}
