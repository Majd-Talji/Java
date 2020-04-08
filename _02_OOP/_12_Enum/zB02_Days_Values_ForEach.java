package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_Days_Values_ForEach {

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

        for (Days d : Days.values()) {
            System.out.println(d);
        }

    }

}
