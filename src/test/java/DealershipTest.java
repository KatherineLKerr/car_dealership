import cars.Car;
import cars.ElectricCar;
import components.Doors;
import components.Engine;
import components.Tyres;
import dealership.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ElectricCar electricCar;
    Doors doors;
    Tyres tyres;
    Engine engine;
    Customer customer;

    @Before
    public void setUp() {
        dealership = new Dealership();
        doors = new Doors(4, true);
        engine = new Engine("electric");
        tyres = new Tyres(4, "normal");
        electricCar = new ElectricCar(doors, engine, tyres, "car", "blue", 5000);
    }

    @Test
    public void startsWithEmptyArray() {
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canAddToStock() {
        dealership.addToStock(electricCar);
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void sellingRemovesCarFromStock() {
        dealership.addToStock(electricCar);
        dealership.sell(electricCar);
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void sellingRemovesCustomersMoney(){
        dealership.addToStock(electricCar);
        dealership.sell(electricCar);
        assertEquals(5000, dealership.getCustomer().getMoney());
    }

    @Test
    public void sellingAddsCarToCustomer() {
        dealership.addToStock(electricCar);
        dealership.sell(electricCar);
        assertEquals(1, dealership.getCustomer().getCars().size());
    }

    @Test
    public void sellingAddsMoneyToTill() {
        dealership.addToStock(electricCar);
        dealership.sell(electricCar);
        assertEquals(15000, dealership.getTill().getMoney());
    }

}
