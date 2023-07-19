import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Reader {
    private final String name;
    private final String readerID;
    private Set<Category> favoriteCategory;
    private Map<Book, Integer> borrowedBooks;

    public Reader(String name, String readerID, Set<Category> favoriteCategory, Map<Book, Integer> borrowedBooks) {
        this.name = name;
        this.readerID = readerID;
        this.favoriteCategory = favoriteCategory;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public String getReaderID() {
        return readerID;
    }

    public Set<Category> getFavoriteCategory() {
        return favoriteCategory;
    }

    public void addFavoriteCategory(Category category) {
        this.favoriteCategory.add(category);
    }
    public void removeFavoriteCategory(Category category){
        this.favoriteCategory.remove(category);
    }

    public Map<Book, Integer> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBooks(Book book) {

        if (borrowedBooks.containsKey(book)) {
            int current = borrowedBooks.getOrDefault(book, 0);
            if (current > 0) {
                borrowedBooks.put(book, current - 1);
                book.setTotalCopies(book.getTotalCopies() - 1);
                System.out.println("The book is borrowed : " + book.getTitle());
            } else {
                System.out.println("The book is unavailable");
            }
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.containsKey(book)) {
            int current = borrowedBooks.getOrDefault(book, 0);
            borrowedBooks.put(book, current + 1);
            book.setTotalCopies(book.getTotalCopies() + 1);
            System.out.println("The book is returned " + book.getTitle());
        }else{
            System.out.println("This book is not in this library! ");
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readerID='" + readerID + '\'' +
                ", favoriteCategory=" + favoriteCategory +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
