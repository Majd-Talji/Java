package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_Set_Value_Index_Size {
    
    enum Size {
        
        SMALL(100),
        MEDIUM(150),
        LARGE(200),
        XLARGE(250);
        
        private int value;
        
        private Size(int value) {
            this.value = value;
        }
        
    }    
    
    public static void main(String[] args) {
        
        for (Size s : Size.values()) {
            System.out.println(s + " " + s.value);
        }
        
    }
    
}
