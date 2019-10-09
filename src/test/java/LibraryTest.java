import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;
    Book book8;
    Book book9;
    Book book10;

    @Before
    public void setUp() {
        library = new Library(name: "Central" );
        book1 = new Book(title: "1984", "George Orwell", "classic");
        book2 = new Book(title: "Orlando", "Virginia Wolfe", "novel");
    }

    @Test
    public void bookStockStartsAt10() {
        assertEquals( 10, library.countStock());
    }

    }
}
