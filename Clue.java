public class Clue extends Item {

    // Initialization
    protected String personIncriminated;
    protected boolean accuracy;


    // Constructor
    public Clue(String name, String description, double weight, double value) {

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

    public String getPersonIncriminated() {

        return personIncriminated;

    }

    public boolean isAccuracy() {

        return accuracy;

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

    public void setPersonIncriminated(String personIncriminated) {

        this.personIncriminated = personIncriminated;

    }

    public void setAccuracy(boolean accuracy) {

        this.accuracy = accuracy;

    }

}