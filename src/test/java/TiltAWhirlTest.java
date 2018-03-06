import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TiltAWhirlTest {

    TiltAWhirl tiltAWhirl;

    @Before
    public void setUp() throws Exception {
        tiltAWhirl = new TiltAWhirl("Primeval Whirl", 3, 18, 1.00);
    }

    @Test
    public void testHasName() {
        assertEquals("Primeval Whirl", tiltAWhirl.getName());
    }

    @Test
    public void testTickets() {
        assertEquals(3, tiltAWhirl.getTickets());
    }

    @Test
    public void testRideCapacity() {
        assertEquals(18, tiltAWhirl.getCapacity());
    }

    @Test
    public void testRideHasHeightReq() {
        assertEquals(1.00, tiltAWhirl.getMinHeight(), 0.01);
    }
}
