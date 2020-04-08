package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB01_PatternCompile_Matcher {
    
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("a*b");
        
        Matcher m = p.matcher("aaaaaaab");
        
        System.out.println("Result: " + m.matches());
        
    }
    
}
