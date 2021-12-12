package connector;

import model.Book;


// api: lektury szkolne
public class ApiConnectorImpl implements ApiConnector {
    @Override
    public Book getByName(String name) {
        return new Book();
    }
}
