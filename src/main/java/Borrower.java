import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name) {
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }


}
