package cars;

import components.Doors;
import components.Engine;
import components.Tyres;

public class ElectricCar extends Car{

    public ElectricCar(Doors doors, Engine engine, Tyres tyres, String name, String colour, int price, int damage) {
        super(doors, engine, tyres, name, colour, price, damage);
    }

}
