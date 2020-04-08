package _01_Basis._09_Strings._02_Methodes._05_Manipulation;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_copyValueOf {

    public static void main(String[] args) {

        char[] ch = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a'};
        String s = "";

        s = String.copyValueOf( ch );
        System.out.println( s );

        s = String.copyValueOf( ch, 2, 4 );
        System.out.println( s );

    }

}
