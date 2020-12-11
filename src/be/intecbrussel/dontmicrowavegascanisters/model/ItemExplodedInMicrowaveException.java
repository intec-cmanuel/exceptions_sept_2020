package be.intecbrussel.dontmicrowavegascanisters.model;

public class ItemExplodedInMicrowaveException extends Exception{
    public ItemExplodedInMicrowaveException() {
    }

    public ItemExplodedInMicrowaveException(String message) {
        super(message);
    }

    public ItemExplodedInMicrowaveException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemExplodedInMicrowaveException(Throwable cause) {
        super(cause);
    }
}
