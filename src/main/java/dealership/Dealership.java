package dealership;

import cars.Car;
import cars.ElectricCar;

import java.util.ArrayList;

public class Dealership {

    ArrayList<Car> stock;
    Customer customer;
    Dealer dealer;
    Till till;

    public Dealership() {
        this.stock = new ArrayList();
        this.customer = new Customer(10000);
        this.dealer = new Dealer("pierre");
        this.till = new Till(10000);
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void addToStock(Car car) {
        stock.add(car);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Till getTill() {
        return till;
    }

    public void sell(Car car) {
        //remove money from customer
        customer.pay(car.getPrice());
        //add money to till
        till.addMoney(car.getPrice());
        //remove car from dealership
        //add car to customer
        int index = 0;
        for (int i = 0; i < stock.size(); i ++) {
            if ( stock.get(i) == car) {
                index = i;
                customer.addCar(car);
            }
        }
        stock.remove(index);
    }

    public void buyCar(Car car) {
        stock.add(car);
        till.takeMoney(car.getPrice());
    }
}
