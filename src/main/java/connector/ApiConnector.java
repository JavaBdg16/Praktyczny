package connector;

import model.Book;

public interface ApiConnector {

    Book getByName(String name);
}
