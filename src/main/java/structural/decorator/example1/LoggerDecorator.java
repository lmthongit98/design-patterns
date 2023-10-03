package structural.decorator.example1;

public abstract class LoggerDecorator implements Logger {
    protected Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }
}
