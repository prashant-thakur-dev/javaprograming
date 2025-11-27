package src.lambda;

import java.util.Comparator;
import java.util.List;

public class BookService {
    public static void main(String[] args) {

    }
    public List<Book> inSort(){
        List<Book> books = new BookDAO().getBook();
            return books;
    }
}

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        return 0;
    }
}
