package src.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"Core Java",400));
        books.add(new Book(102,"Core Java",400));
        books.add(new Book(103,"Core Java",400));
        books.add(new Book(104,"Core Java",400));
        return books;
    }
}
