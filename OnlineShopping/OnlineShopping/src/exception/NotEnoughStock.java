package exception;

public class NotEnoughStock extends Exception {
    public NotEnoughStock() {
    }

    public NotEnoughStock(String message) {
        super(message);
    }

    public NotEnoughStock(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStock(Throwable cause) {
        super(cause);
    }

    public NotEnoughStock(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
