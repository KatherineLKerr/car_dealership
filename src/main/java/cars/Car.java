package cars;

import components.Doors;
import components.Engine;
import components.Tyres;

public abstract class Car {

    private Doors doors;
    private Engine engine;
    private Tyres tyres;
    private String name;
    private String colour;
    private int fullPrice;
    private int damage;

    public Car(Doors doors, Engine engine, Tyres tyres, String name, String colour, int fullPrice, int damage) {
        this.doors = doors;
        this.engine = engine;
        this.tyres = tyres;
        this.name = name;
        this.colour = colour;
        this.fullPrice = fullPrice;
        this.damage = damage;
    }

    public Doors getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return fullPrice - damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
