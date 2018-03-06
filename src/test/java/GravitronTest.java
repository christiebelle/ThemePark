import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GravitronTest {

    Gravitron gravitron;

    @Before
    public void setUp() throws Exception {
        gravitron = new Gravitron("The Waltzer", 3, 20, 1.1);
    }

    @Test
    public void testHasName() {
        assertEquals("The Waltzer", gravitron.getName());
    }

    @Test
    public void testTickets() {
        assertEquals(3, gravitron.getTickets());
    }

    @Test
    public void testRideCapacity() {
        assertEquals(20, gravitron.getCapacity());
    }

    @Test
    public void testRideHasHeightReq() {
        assertEquals(1.1, gravitron.getMinHeight(), 0.01);
    }
}
