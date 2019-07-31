package dealership;

import cars.Car;
import cars.HybridCar;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Car>cars;

    public Customer(int money) {
        this.money = money;
        this.cars = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void pay(int amount) {
        this.money -= amount;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }
}
