package structural.decorator.example1;

public class DatabaseLogger extends LoggerDecorator {

    public DatabaseLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        super.logger.log(message);
        System.out.println("Logged to database with message: " + message);
    }

}
