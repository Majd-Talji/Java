package _02_OOP._02_Modifiers.zB02_static_02;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Book b1 = new Book("java", "Majd Talji", 500);
        Book b2 = new Book("HTML", "Hala Talji", 326);
        Book b3 = new Book("C++", "Muhmad Suliman", 200);
        
        b1.printBookInfo();
        b2.printBookInfo();
        b3.printBookInfo();
        
        Book.printTotalNumberOfBooks();
        
    }
    
}
