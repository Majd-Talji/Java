package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_Switch {
    
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
        
        Days userSelectDay = Days.THURSDAY;
        
        switch(userSelectDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("We are available from 8:00 AM to 4:00 PM.");
                break;
                
            case FRIDAY:
                System.out.println("We are available from 8:00 AM to 12:00 PM.");
                break;
                
            default:
                System.out.println("We are not avaiable on vacations.");
        }
        
    }
    
}
