import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void setup() {
        tyres = new Tyres(4, "Normal");
    }

    @Test
    public void canGetNoTyres() {
        assertEquals(4, tyres.getNoOfTyres());
    }

    @Test
    public void canGetTyreType() {
        assertEquals("Normal", tyres.getType());
    }
}
