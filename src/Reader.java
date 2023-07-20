import java.util.*;

public class Reader {
    private final String name;
    private final String readerID;
    private Set<Category> favoriteCategory;
    private final Map<Book, Integer> borrowedBooks;


    public Reader(String name, String readerID, Set<Category> favoriteCategory) {
        this.name = name;
        this.readerID = readerID;
        this.favoriteCategory = favoriteCategory;
        this.borrowedBooks = new HashMap<>();
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

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readerID='" + readerID + '\'' +
                ", favoriteCategory=" + favoriteCategory ;
    }
}
