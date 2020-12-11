package be.intecbrussel.dontmicrowavegascanisters.model;

public class Human {
    private String name;
    private int smartness;
    private Item itemHeld;
    private Microwave microwave;

    public Human (String name, int smartness) {
        this.name = name;
        this.smartness = smartness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public Item getItemHeld() {
        return itemHeld;
    }

    public void setItemHeld(Item itemHeld) {
        this.itemHeld = itemHeld;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public void setMicrowave(Microwave microwave) {
        this.microwave = microwave;
    }
}
