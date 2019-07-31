import cars.Car;
import cars.ElectricCar;
import components.Doors;
import components.Engine;
import components.Tyres;
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
}
