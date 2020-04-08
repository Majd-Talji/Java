package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB02_lookingAt_find_matches_Methods_01 {
    
    public static void main(String[] args) {
        
        String REGEX = "java";
        String INPUT = "java language, java is free, java is amazing";
        
        Pattern p = Pattern.compile(REGEX);
        
        Matcher m = p.matcher(INPUT);
        
        System.out.println("lookingAt() \n return: " + m.lookingAt() + "\n");
        System.out.println("find() \n return: "      + m.find()      + "\n");
        System.out.println("matches() \n return: "   + m.matches()   + "\n");
        
    }
    
}
