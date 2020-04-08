package _03_Advanced._06_Generics._02_Generics_Class;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Box objectBox = new Box();
        
        objectBox.set("object type can store any type of data.");
        
        System.out.println("objectBox contains: " + objectBox.get());
        
        objectBox.set(1234);
        
        System.out.println("object contains: " + objectBox.get());
        
        Box<Integer> integerBox = new Box();
        
        integerBox.set(100);
        
        System.out.println("integerBox contains: " + integerBox.get());
        
        Box<String> stringBox = new Box();
        
        stringBox.set("Hello, my type is String.");
        
        System.out.println("stringBox contains: " + stringBox.get());
        
    }
    
}
