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
