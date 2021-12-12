package repository;

import entity.BookEntity;

public interface Repository {

    BookEntity getByName(String name);

    BookEntity save(BookEntity bookEntity);
}
