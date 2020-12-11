package be.intecbrussel.gameshop.exception;

public class GameShopException extends Exception{
    public GameShopException() {
    }

    public GameShopException(String message) {
        super(message);
    }

    public GameShopException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameShopException(Throwable cause) {
        super(cause);
    }
}
