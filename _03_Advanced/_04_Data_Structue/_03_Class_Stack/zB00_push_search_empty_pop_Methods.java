package _03_Advanced._04_Data_Structue._03_Class_Stack;

import java.util.Stack;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class zB00_push_search_empty_pop_Methods {
    
    public static void main(String[] args) {
        
        Stack s = new Stack();
        
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        
        System.out.println("Search result for the object 'A': " + s.search("A"));
        System.out.println("Search result for the object 'B': " + s.search("B"));
        System.out.println("Search result for the object 'C': " + s.search("C"));
        System.out.println("Search result for the object 'D': " + s.search("D") + "\n");
        
        System.out.println("Search result for the object 'X': " + s.search("X"));
        System.out.println("Search result for the object 'Y': " + s.search("Y") + "\n");
        
        System.out.println("All elements in the stack: ");
        
        while (!s.empty()) {            
            System.out.println(s.pop());
        }
        
    }
    
}
