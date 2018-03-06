import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotDogTest {

    HotDog hotdog;

    @Before
    public void setUp() throws Exception {
        hotdog = new HotDog(5, 10, "Meat");
    }
    @Test
    public void testHasKind() {
        assertEquals("Meat", hotdog.getKind());
    }

    @Test
    public void testHasPrice() {
        assertEquals(5, hotdog.getPrice());
    }

    @Test
    public void testStockLevel() {
        assertEquals(10, hotdog.getQuantity());
    }
}
