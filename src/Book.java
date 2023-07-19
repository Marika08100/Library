import java.util.List;
import java.util.Set;

public class Book {
    private final String title;
    private final int publicationYear;
    private final List<Author> authors;
    private final Set<Category> category;
    private int totalCopies;

    public Book(String title, int publicationYear, List<Author> authors, Set<Category> category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.authors = authors;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }
}
