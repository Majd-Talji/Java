package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_Set_Values_Size {
    
    enum Size {
        
        SMALL(100, "small"),
        MEDIUM(150, "meduim"),
        LARGE(200, "large"),
        XLARGE(250, "x-large");
        
        private int value;
        private String name;
        
        private Size(int value, String name) {
            this.value = value;
            this.name = name;
        }
        
    }
    
    public static void main(String[] args) {
        
        for (Size s : Size.values()) {
            System.out.println(s.name + " " + s.value);
        }
        
    }
    
}
