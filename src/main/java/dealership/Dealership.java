package dealership;

import cars.Car;
import cars.ElectricCar;

import java.util.ArrayList;

public class Dealership {

    ArrayList<Car> stock;

    public Dealership() {
        this.stock = new ArrayList();
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void addToStock(Car car) {
        stock.add(car);
    }
}
