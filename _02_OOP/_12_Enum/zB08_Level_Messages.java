package _02_OOP._12_Enum;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
// In an external file. Level.java
enum Level {
    EASY,
    NORMAL,
    HARD;
}

// In an external file. Messages.java
class Messages {

    public void showPlayMessage(Level userLevel) {
        switch (userLevel) {
            case EASY:
                System.out.println("Play Game In Easy Mode.");
                break;
            case NORMAL:
                System.out.println("Play Game In Normal Mode.");
                break;
            case HARD:
                System.out.println("Play Game In Hard Mode.");
        }
    }

}

public class zB08_Level_Messages {

    public static void main(String[] args) {

        Messages msg = new Messages();
        msg.showPlayMessage(Level.NORMAL);

    }

}
