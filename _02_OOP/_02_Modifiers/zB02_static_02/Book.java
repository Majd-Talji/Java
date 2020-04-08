package _02_OOP._02_Modifiers.zB02_static_02;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Book {

    public String bookName;
    public String bookAuthor;
    public int pageNumber;

    private static int bookCounter;

    public Book(String bookName, String bookAuthor, int pageNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageNumber = pageNumber;

        bookCounter++;
    }

    public void printBookInfo() {
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Number of page: " + pageNumber);
        System.out.println("------------------------------");
    }
    
    public static void printTotalNumberOfBooks() {
        System.out.println("The total number of books is: " + bookCounter);
    }

}
