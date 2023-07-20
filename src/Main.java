import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Verity", 2018, List.of(new Author("Collen Hoover")), Set.of((Category.ROMANCE) ));
        Book book2 = new Book("Nothing", 2018, List.of(new Author("Janne Teller")), Set.of(Category.SCIENCE_FICTION));

        Reader reader1 = new Reader("Reader 1", "HA158X", Set.of(Category.CRIME));
        Reader reader2 = new Reader("Reader 2", "TMP5896M", Set.of(Category.ADVENTURE));

        library.addBook(book1);
        library.addBook(book2);

        library.addReader(reader1);
        library.addReader(reader2);

        reader1.borrowBook(book1);
        reader1.borrowBook(book2);
        reader2.borrowBook(book2);

        reader1.returnBook(book1);
        reader2.returnBook(book2);

        Book mostBorrowedBook = library.getMostBorrowedBook();
        if (mostBorrowedBook != null) {
            System.out.println("Most borrowed book: " + mostBorrowedBook.getTitle());
        } else {
            System.out.println("No books were borrowed yet.");
        }


    }
}
