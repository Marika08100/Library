import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Reader> readers;
    private List<Book> books;

    public Library() {
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchBookByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchBookByTitle(String title){
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if(book.getTitle().contains(title)){
                result.add(book);
            }

        }
        return result;
    }
    public List<Book> searchBookByCategory(Category category){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getCategory().contains(category)){
                result.add(book);
            }
        }
        return result;
    }

}
