package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB03_start_end_Methods {

    public static void main(String[] args) {

        String REGEX = "java";
        String INPUT = "java language, java is free, java is amazing";

        Pattern p = Pattern.compile(REGEX);

        Matcher m = p.matcher(INPUT);

        int count = 0;

        while (m.find()) {

            count++;
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
            System.out.println();

        }

        System.out.println("Match number: " + count);

    }

}
