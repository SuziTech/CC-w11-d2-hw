import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;

    public int countStock() {
        return this.stock.size();
    }
}
