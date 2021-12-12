import application.Application;
import connector.ApiConnector;
import connector.ApiConnectorImpl;
import connector.GoodReadsApiConnector;
import repository.Repository;
import repository.RepositoryImpl;
import servcie.AppService;
import servcie.AppServiceImpl;

public class Startup {

    public static void main(String[] args) {

        ApiConnector apiConnector = new GoodReadsApiConnector();
        Repository repository = new RepositoryImpl();
        AppService appService = new AppServiceImpl(apiConnector, repository);

        new Application(appService).start();
    }
}
