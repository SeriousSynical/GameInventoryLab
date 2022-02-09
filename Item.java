public class Item {

    // Initialization
    protected String name;
    protected String description;
    protected double weight;
    protected double value;


    // Constructors
    public Item(String name, String description, double weight, double value) {

        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;

    }


    // Getters
    public String getName() {

        return name;

    }

    public String getDescription() {

        return description;

    }

    public double getWeight() {

        return weight;

    }

    public double getValue() {

        return value;

    }


    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    public void setValue(double value) {

        this.value = value;

    }


    // Display
    public String toString() {

        return "Item Name: " + this.name + "\nDescription: " + this.description + "\nWeight: " + this.weight + " pounds\nValue: " + this.value + "gp";

    }

}