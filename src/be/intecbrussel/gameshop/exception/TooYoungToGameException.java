package be.intecbrussel.gameshop.exception;

public class TooYoungToGameException extends GameShopException{
    public TooYoungToGameException() {
    }

    public TooYoungToGameException(String message) {
        super(message);
    }

    public TooYoungToGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooYoungToGameException(Throwable cause) {
        super(cause);
    }
}
