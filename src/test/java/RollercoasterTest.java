import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Wild Eagle", 5, 10, 1.27);
    }

    @Test
    public void testHasName() {
        assertEquals("Wild Eagle", rollercoaster.getName());
    }

    @Test
    public void testTickets() {
        assertEquals(5, rollercoaster.getTickets());
    }

    @Test
    public void testRideCapacity() {
        assertEquals(10, rollercoaster.getCapacity());
    }

    @Test
    public void testRideHasHeightReq() {
        assertEquals(1.27, rollercoaster.getMinHeight(), 0.01);
    }
}
