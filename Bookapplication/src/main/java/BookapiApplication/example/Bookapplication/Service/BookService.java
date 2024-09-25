package BookapiApplication.example.Bookapplication.Service;

import BookapiApplication.example.Bookapplication.Entity.Book;
import BookapiApplication.example.Bookapplication.repositories.Bookrepositories; // Note the casing here
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private Bookrepositories bookRepositories; // Ensure the naming matches the class name

    public List<Book> getAllBooks() {
        return bookRepositories.findAll(); // Corrected variable name
    }

    public Book getBookById(Long id) {
        return bookRepositories.findById(id).orElse(null); // Corrected variable name
    }

    public Book createBook(Book book) {
        return bookRepositories.save(book); // Corrected variable name
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepositories.findById(id).orElse(null); // Corrected variable name
        if (book != null) {
            if (bookDetails.getTitle() != null) {
                book.setTitle(bookDetails.getTitle());
            }
            if (bookDetails.getAuthor() != null) {
                book.setAuthor(bookDetails.getAuthor());
            }
            if (bookDetails.getGenre() != null) {
                book.setGenre(bookDetails.getGenre());
            }
            return bookRepositories.save(book); // Corrected variable name
        }
        return null;
    }

    public void deleteBook(Long id) {
        bookRepositories.deleteById(id); // Corrected variable name
    }
}
