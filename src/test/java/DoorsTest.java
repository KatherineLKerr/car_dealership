import components.Doors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorsTest {

    Doors doors;

    @Before
    public void setUp() {
        doors = new Doors(2, true);
    }

    @Test
    public void canGetNoOfDoors() {
        assertEquals(2, doors.getNoOfDoors());
    }

    @Test
    public void hasElectricWindows() {
        assertEquals(true, doors.isElectricWindows());
    }
}
