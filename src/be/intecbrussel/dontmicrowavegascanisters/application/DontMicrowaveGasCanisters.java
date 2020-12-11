package be.intecbrussel.dontmicrowavegascanisters.application;

import be.intecbrussel.dontmicrowavegascanisters.model.Human;
import be.intecbrussel.dontmicrowavegascanisters.model.Item;
import be.intecbrussel.dontmicrowavegascanisters.model.ItemExplodedInMicrowaveException;
import be.intecbrussel.dontmicrowavegascanisters.model.Vendor;

public class DontMicrowaveGasCanisters {
    public static void main(String[] args) throws ItemExplodedInMicrowaveException {
        Human elline = new Human("Elline", 99);
        Human audric = new Human("Audric Neutron", 200);
        Human notAnthonyforSure = new Human("Anthonio", 300);
        Human[] humans = {elline,audric,notAnthonyforSure};

        Vendor mustafa = new Vendor("Mustafa");

        elline.setMicrowave(mustafa.buyMicrowave("Pink Microwave mini Deluxe", "Apple"));
        audric.setMicrowave(mustafa.buyMicrowave("SilverCrest", "Aldi"));
        notAnthonyforSure.setMicrowave(mustafa.buyMicrowave("ManuTosh", "MacManu"));

        elline.setItemHeld(new Item("iPhone 12 pro", false));
        audric.setItemHeld(new Item("a car", false));
        notAnthonyforSure.setItemHeld(new Item("FlashBackColruytEgg", true));

        for (Human human : humans) {
            microwaveItem(human);
        }

    }

    private static boolean microwaveItem(Human human) {
        try {
            human.getMicrowave().microwaveItem(human.getItemHeld());
            return true;
        } catch (ItemExplodedInMicrowaveException ieime) {
            System.out.println(ieime.getMessage());
            return false;
        } finally {
            System.out.println("Microwaving done for: " + human.getName());
        }
    }
}
