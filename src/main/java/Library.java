import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.book = new ArrayList<>();
    }

    public int bookCount() {
        return this.book.size();
    }

    public void addBook(Book book){
        this.book.add(book);
    }

    public Book removeBook() {
        return this.book.remove(0);
    }

    public boolean maxCapacity() {
        if(this.bookCount() == capacity)
          return true;
        return false;
    }
}
