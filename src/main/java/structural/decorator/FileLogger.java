package structural.decorator;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Logged to file with message: " + message);
    }

}
