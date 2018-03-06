import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    private CandyFloss candyfloss;

    @Before
    public void setUp() throws Exception {
        candyfloss = new CandyFloss(3, 10, "Vanilla Pink");
    }

    @Test
    public void testHasFlavour() {
        assertEquals("Vanilla Pink", candyfloss.getFlavour());
    }

    @Test
    public void testHasPrice() {
        assertEquals(3, candyfloss.getPrice());
    }

    @Test
    public void testStockLevel() {
        assertEquals(10, candyfloss.getQuantity());
    }
}
