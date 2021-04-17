package demo.Interfaces;

public class BookImpl implements Book, LibraryBook, OfficeBook {

    @Override
    public void displayBook(String bookName) {
        System.out.println("BookName is " +  bookName);
    }

    @Override
    public int addAuthor(String authorName) {
        System.out.println("Added the author " + authorName);
        return 0;
    }

    @Override
    public int addShelfToBook(String shelfId) {
        System.out.println("Added the shelf with id " + shelfId);
        return 0;
    }

    @Override
    public int addOfficeId(String officeId) {
        System.out.println("Added the office with id " + officeId);
        return 0;
    }
}
