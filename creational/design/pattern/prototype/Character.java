package creational.design.pattern.prototype;

public class Character implements Cloneable{
    private String name;
    private int health;
    private int level;
    private int power;

    public Character(String name, int health, int level, int power) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }

    @Override
    public Character clone() throws CloneNotSupportedException{
        return (Character) super.clone();
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", power=" + power +
                '}';
    }
}
