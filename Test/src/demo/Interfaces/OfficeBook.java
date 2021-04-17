package demo.Interfaces;

public interface OfficeBook {
    public default void displayBook(String bookName){
        System.out.println("The book name is " + bookName);
    }

    int addOfficeId(String officeId);

}
