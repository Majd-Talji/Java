package _03_Advanced._10_Lambda_Expressions._06_forEach_Lambda;

import java.util.ArrayList;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Lambda_ForEach {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList();
        
        names.add("Mohamad");
        names.add("Hala");
        names.add("Ahmad");
        names.add("Racha");
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        System.out.println("-------------------------");
        
        for (String s : names) {
            System.out.println(s);
        }
        
        System.out.println("-------------------------");
        
        names.forEach((s) -> {
            System.out.println(s);
        });
        
        System.out.println("-------------------------");
        
        names.forEach(
                s -> System.out.println(s)
        );
        
    }
    
}
