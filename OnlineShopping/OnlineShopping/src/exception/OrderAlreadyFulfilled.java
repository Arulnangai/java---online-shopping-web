package exception;

public class OrderAlreadyFulfilled extends Exception {
    public OrderAlreadyFulfilled() {
    }

    public OrderAlreadyFulfilled(String message) {
        super(message);
    }

    public OrderAlreadyFulfilled(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderAlreadyFulfilled(Throwable cause) {
        super(cause);
    }

    public OrderAlreadyFulfilled(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
