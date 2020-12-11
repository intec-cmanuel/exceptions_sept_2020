package be.intecbrussel.dontmicrowavegascanisters.model;

public class Vendor {
    private String name;

    public Vendor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Microwave buyMicrowave(String modelName, String brand) {
        return new Microwave(modelName, brand);
    }
}
