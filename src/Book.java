import java.util.List;
import java.util.Set;

public class Book {
    private final String title;
    private final int publicationYear;
    private final List<Author> authors;
    private final Set<Category> category;

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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", authors=" + authors +
                ", category=" + category +
                '}';
    }
}
