package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB04_replaceFirst_replaceAll_Methods_02 {

    public static void main(String[] args) {

        String REGEX = "dog";
        String INPUT = "I have one dog, my friend have two dogs and one bird.";
        
        Pattern p = Pattern.compile(REGEX);
        
        Matcher m = p.matcher(INPUT);
        
        INPUT = m.replaceAll("cat");
        
        System.out.println(INPUT);
        
    }

}
