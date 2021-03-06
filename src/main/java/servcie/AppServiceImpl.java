package servcie;

import connector.ApiConnector;
import entity.BookEntity;
import mapper.BookMapper;
import model.Book;
import repository.Repository;

public class AppServiceImpl implements AppService {

    private final ApiConnector apiConnector;
    private final Repository repository;

    public AppServiceImpl(ApiConnector apiConnector, Repository repository) {
        this.apiConnector = apiConnector;
        this.repository = repository;
    }

    @Override
    public Book getByName(String name) {

        BookEntity bookEntity = repository.getByName(name);

        if (bookEntity == null) {
            Book book = apiConnector.getByName(name);

            bookEntity = BookMapper.mapBookToBookEntity(book);
            repository.save(bookEntity);

            return book;
        } else {
            Book book = BookMapper.mapBookEntityToBook(bookEntity);
            return book;
        }
    }
}
