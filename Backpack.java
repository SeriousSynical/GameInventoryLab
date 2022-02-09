import java.util.ArrayList;

public class Backpack {

    // Initialization
    ArrayList<Item> contents = new ArrayList<>();
    ArrayList<Weapon> weapons = new ArrayList<>();
    ArrayList<Clue> clues = new ArrayList<>();
    ArrayList<Consumable> consumables = new ArrayList<>();

    // Add
    public void add(Weapon weapon) {

        this.contents.add(weapon);
        this.weapons.add(weapon);

    }

    public void add(Clue clue) {

        this.contents.add(clue);
        this.clues.add(clue);

    }

    public void add(Consumable consumable) {

        this.contents.add(consumable);
        this.consumables.add(consumable);

    }


    // Display
    public String listWeapons() {

        String list = "";

        list += "Weapons ------------------------------------------\n";

        for (Weapon weapon : this.weapons) {

            list += weapon.toString() + "\n";
            list += "--------------------------------------------------\n";

        }

        list += "\n";

        return list;

    }


    public String listClues() {

        String list = "";

        list += "Clues --------------------------------------------\n";

        for (Clue clue : this.clues) {

            list += clue.toString() + "\n";
            list += "--------------------------------------------------\n";

        }

        list += "\n";

        return list;

    }


    public String listConsumables() {

        String list = "";

        list += "Consumables --------------------------------------\n";

        for (Consumable consumable : this.consumables) {

            list += consumable.toString() + "\n";
            list += "--------------------------------------------------\n";

        }

        list += "\n";

        return list;

    }

}
