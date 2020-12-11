package be.intecbrussel.gameshop.exception;

public class EmptyStockException extends GameShopException{
    public EmptyStockException() {
    }

    public EmptyStockException(String message) {
        super(message);
    }

    public EmptyStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyStockException(Throwable cause) {
        super(cause);
    }
}
