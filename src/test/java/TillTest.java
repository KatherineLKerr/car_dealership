import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp() {
        till = new Till(10000);
    }

    @Test
    public void hasMoney() {
        assertEquals(10000, till.getMoney());
    }

    @Test
    public void canAddMoneyToTill() {
        till.addMoney(1000);
        assertEquals(11000, till.getMoney());
    }

    @Test
    public void canTakeMoneyFromTill() {
        till.takeMoney(500);
        assertEquals(9500, till.getMoney());
    }
}
