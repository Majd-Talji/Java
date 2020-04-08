package _01_Basis._12_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB05_appendReplacement_appendTail_Methods {
    
    public static void main(String[] args) {
        
        String REGEX = "dog";
        String INPUT = "I have one dog, my friend have two dogs and one bird.";
        
        Pattern p = Pattern.compile(REGEX);
        
        Matcher m = p.matcher(INPUT);
        
        StringBuffer sb = new StringBuffer();
        
        while (m.find()) {            
            m.appendReplacement(sb, "cat");
        }
        
        m.appendTail(sb);
        
        System.out.println(sb.toString());
        
    }
    
}
