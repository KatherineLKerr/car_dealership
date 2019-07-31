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
    private int price;

    public Car(Doors doors, Engine engine, Tyres tyres, String name, String colour, int price) {
        this.doors = doors;
        this.engine = engine;
        this.tyres = tyres;
        this.name = name;
        this.colour = colour;
        this.price = price;
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
        return price;
    }
}
