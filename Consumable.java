public class Consumable extends Item {

    // Initialization
    protected int healthEffect;
    protected int dosesRemaining;


    // Constructor
    public Consumable(String name, String description, double weight, double value) {

        super(name, description, weight, value);

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

    public int getHealthEffect() {

        return healthEffect;

    }

    public int getDosesRemaining() {

        return dosesRemaining;

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

    public void setHealthEffect(int healthEffect) {

        this.healthEffect = healthEffect;

    }

    public void setDosesRemaining(int dosesRemaining) {

        this.dosesRemaining = dosesRemaining;

    }

}