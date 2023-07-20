import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final List<Reader> readers;
    private final Map<Book, Integer> borrowedBooks;

    public Library() {
        this.readers = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }
    public void removeReader(Reader reader){
        readers.remove(reader);
    }
    public void addBook(Book book){
        borrowedBooks.put(book,0);
    }
    public void removeBook(Book book){
        borrowedBooks.remove(book);
    }

    public void borrowBook(Book book) {
        int borrowedCount = borrowedBooks.getOrDefault(book, 0);
        if (borrowedCount > 0) {
            borrowedBooks.put(book, borrowedCount - 1);
            System.out.println("The book is borrowed: " + book.getTitle());
        } else {
            System.out.println("The book is unavailable: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.containsKey(book)) {
            int borrowedCount = borrowedBooks.get(book);
            borrowedBooks.put(book, borrowedCount + 1);
            System.out.println("The book is returned: " + book.getTitle());
        } else {
            System.out.println("This book is not borrowed: " + book.getTitle());
        }
    }

    public Map<Book, Integer> getBorrowedBooks() {
        return borrowedBooks;
    }
    public Map<Book, Integer> searchBookByAuthor(Author author) {
        Map<Book, Integer> result = new HashMap<>();
        for (Map.Entry<Book, Integer> entry : borrowedBooks.entrySet()) {
            Book book = entry.getKey();
            if (book.getAuthors().contains(author)) {
                result.put(book, entry.getValue());
            }
        }
        return result;
    }

    public Map<Book, Integer> searchBookByTitle(String title) {
        Map<Book, Integer> result = new HashMap<>();
        for (Map.Entry<Book, Integer> entry : borrowedBooks.entrySet()) {
            Book book = entry.getKey();
            if (book.getTitle().contains(title)) {
                result.put(book, entry.getValue());
            }
        }
        return result;
    }

    public Map<Book, Integer> searchBookByCategory(Category category) {
        Map<Book, Integer> result = new HashMap<>();
        for (Map.Entry<Book, Integer> entry : borrowedBooks.entrySet()) {
            Book book = entry.getKey();
            if (book.getCategory().contains(category)) {
                result.put(book, entry.getValue());
            }
        }
        return result;
    }

    public Map<Reader, Integer> getBorrowedBookCountsByReader() {
        Map<Reader, Integer> borrowedBookCounts = new HashMap<>();
        for (Reader reader : readers) {
            int count = 0;
            for (int borrowedCount : borrowedBooks.values()) {
                count += borrowedCount;
            }
            borrowedBookCounts.put(reader, count);
        }
        return borrowedBookCounts;
    }

    public Book getMostBorrowedBook() {
        Book mostBorrowedBook = null;
        int maxBorrowedCount = 0;
        for (Map.Entry<Book, Integer> entry : borrowedBooks.entrySet()) {
            int borrowedCount = entry.getValue();
            if (borrowedCount > maxBorrowedCount) {
                mostBorrowedBook = entry.getKey();
                maxBorrowedCount = borrowedCount;
            }
        }
        return mostBorrowedBook;
    }


}
