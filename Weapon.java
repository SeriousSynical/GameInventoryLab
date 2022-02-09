public class Weapon extends Clue {

    // Initialization
    protected int damage;
    protected DamageType damageType;


    // Constructor
    public Weapon(String name, String description, double weight, double value) {

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

    public int getDamage() {

        return damage;

    }

    public DamageType getDamageType() {

        return damageType;

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

    public void setDamage(int damage) {

        this.damage = damage;

    }

    public void setDamageType(DamageType damageType) {

        this.damageType = damageType;

    }

}