package be.intecbrussel.dontmicrowavegascanisters.model;

public class Item {
    private String name;
    private boolean willExplodeInMicrowave;

    public Item(String name, boolean willExplodeInMicrowave) {
        this.name = name;
        this.willExplodeInMicrowave = willExplodeInMicrowave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean WillExplodeInMicrowave() {
        return willExplodeInMicrowave;
    }

    public void setWillExplodeInMicrowave(boolean willExplodeInMicrowave) {
        this.willExplodeInMicrowave = willExplodeInMicrowave;
    }
}
