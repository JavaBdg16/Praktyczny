package mapper;

import entity.BookEntity;
import model.Book;

public class BookMapper {

    public static Book mapBookEntityToBook(BookEntity bookEntity) {
        Book book = new Book();

        // use setters
        // book.setName(bookEntity.getName());

        return book;
    }

    public static BookEntity mapBookToBookEntity(Book book) {
        BookEntity bookEntity = new BookEntity();

        // use setters
        // bookEntity.setName(book.getName());

        return bookEntity;
    }
}
