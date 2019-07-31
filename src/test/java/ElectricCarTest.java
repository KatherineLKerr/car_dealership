import cars.ElectricCar;
import components.Doors;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Doors doors;
    Engine engine;
    Tyres tyres;


    @Before
    public void setUp() {
        doors = new Doors(4, true);
        engine = new Engine("electric");
        tyres = new Tyres(4, "normal");
        electricCar = new ElectricCar(doors, engine, tyres, "car", "blue", 5000);
    }

    @Test
    public void getNumberOfDoors() {
        assertEquals(4, electricCar.getDoors().getNoOfDoors());
    }

    @Test
    public void hasElectricWindows() {
        assertEquals(true, electricCar.getDoors().isElectricWindows());
    }

    @Test
    public void getTypeOfEngine() {
        assertEquals("electric", electricCar.getEngine().getType());
    }

    @Test
    public void getNumberOfTyres() {
        assertEquals(4, electricCar.getTyres().getNoOfTyres());
    }

    @Test
    public void getTypeOfTyres() {
        assertEquals("normal", electricCar.getTyres().getType());
    }

    @Test
    public void hasName() {
        assertEquals("car", electricCar.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, electricCar.getPrice());
    }
}
