import cars.HybridCar;
import components.Doors;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Doors doors;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp() {
        doors = new Doors(4, false);
        engine = new Engine("hybrid");
        tyres = new Tyres(4, "normal");
        hybridCar = new HybridCar(doors, engine, tyres, "car", "blue", 5000);
    }

    @Test
    public void getNumberOfDoors() {
        assertEquals(4, hybridCar.getDoors().getNoOfDoors());
    }

    @Test
    public void hasElectricWindows() {
        assertEquals(false, hybridCar.getDoors().isElectricWindows());
    }

    @Test
    public void getTypeOfEngine() {
        assertEquals("hybrid", hybridCar.getEngine().getType());
    }

    @Test
    public void getNumberOfTyres() {
        assertEquals(4, hybridCar.getTyres().getNoOfTyres());
    }

    @Test
    public void getTypeOfTyres() {
        assertEquals("normal", hybridCar.getTyres().getType());
    }

    @Test
    public void hasName() {
        assertEquals("car", hybridCar.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", hybridCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, hybridCar.getPrice());
    }
}
