import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PopcornTest {

    private Popcorn popcorn;

    @Before
    public void setUp() throws Exception {
        popcorn = new Popcorn(2, 10, "Sweet Popcorn");
    }

    @Test
    public void testHasType() {
        assertEquals("Sweet Popcorn", popcorn.getType());
    }

    @Test
    public void testHasPrice() {
        assertEquals(2, popcorn.getPrice());
    }

    @Test
    public void testStockLevel() {
        assertEquals(10, popcorn.getQuantity());
    }
}
