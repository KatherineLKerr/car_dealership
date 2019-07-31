import cars.Car;
import cars.HybridCar;
import components.Doors;
import components.Engine;
import components.Tyres;
import dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    HybridCar hybridCar;
    Doors doors;
    Tyres tyres;
    Engine engine;

    @Before
    public void setUp() {
        customer = new Customer(5000);
        doors = new Doors(4, false);
        engine = new Engine("hybrid");
        tyres = new Tyres(4, "normal");
        hybridCar = new HybridCar(doors, engine, tyres, "car", "blue", 5000, 0);
    }

    @Test
    public void canGetMoney() {
        assertEquals(5000, customer.getMoney());
    }

    @Test
    public void startsWithNoCars() {
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canPay() {
        customer.pay(2000);
        assertEquals(3000, customer.getMoney());
    }

    @Test
    public void canAddCar() {
        customer.addCar(hybridCar);
        assertEquals(1, customer.getCars().size());
    }

}
