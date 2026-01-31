package Payment;

public interface Logger {
    default void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
