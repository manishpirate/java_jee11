package demo.Interfaces;

public interface Book {

    public default void displayBook(String bookName){
        System.out.println("The book name is " + bookName);
    }

    int addAuthor(String authorName);
}
