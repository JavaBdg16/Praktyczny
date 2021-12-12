package repository;

import entity.BookEntity;
import model.Book;

public class RepositoryImpl implements Repository {


    @Override
    public BookEntity getByName(String name) {
        return new BookEntity();
    }

    @Override
    public BookEntity save(BookEntity bookEntity) {
        // TODO
        return null;
    }
}
