package be.intecbrussel.dontmicrowavegascanisters.model;

public class Microwave {
    private String modelName;
    private String brand;

    public Microwave(String modelName, String brand) {
        this.modelName = modelName;
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void microwaveItem(Item itemToMicrowave) throws ItemExplodedInMicrowaveException {
        if (itemToMicrowave.WillExplodeInMicrowave()) {
            throw new ItemExplodedInMicrowaveException(String.format("%s exploded in the microwave! Go buy a new one from Mustafa!", itemToMicrowave.getName()));
        } else {
            System.out.printf("Microwaving done. Enjoy your %s.%n", itemToMicrowave.getName());
        }
    }
}
