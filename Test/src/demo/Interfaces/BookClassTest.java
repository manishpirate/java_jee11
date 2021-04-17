package demo.Interfaces;

public class BookClassTest {

    public static void main(String[] args) {
        BookImpl bookImpl = new BookImpl();
        bookImpl.addAuthor("Manish");
        bookImpl.addShelfToBook("32");
        bookImpl.displayBook("FirstBook");
        bookImpl.addOfficeId("shimlaOffice");
    }

}
