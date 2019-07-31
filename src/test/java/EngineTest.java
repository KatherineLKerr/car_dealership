import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine("electric");
    }

    @Test
    public void canGetType() {
        assertEquals("electric", engine.getType());
    }
}
