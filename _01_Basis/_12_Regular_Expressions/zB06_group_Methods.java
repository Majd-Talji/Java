package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB06_group_Methods {

    public static void main(String[] args) {

        String REGEX = "(.*?)(\\d+)(.*)";
        String line = "This order was placed for QT3000! OK?";

        Pattern p = Pattern.compile(REGEX);

        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("group 0: " + m.group(0));
            System.out.println("group 1: " + m.group(1));
            System.out.println("group 2: " + m.group(2));
            System.out.println("group 3: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

    }

}
