package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_Days_Element {
    
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    
    public static void main(String[] args) {
        
        Days day = Days.THURSDAY;
        
        System.out.println(day);
        
    }
    
}
