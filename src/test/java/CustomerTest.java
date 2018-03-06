import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
    Ride ride;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Christie", 1.79, 50, 10);
        ride = new Rollercoaster("Tennessee Tornado", 5, 15, 1.27);
    }

    @Test
    public void testHasName() {
        assertEquals("Christie", customer.getName());
    }

    @Test
    public void testCustomerHeight() {
        assertEquals(1.79, customer.getHeight(), 0.01);
    }

    @Test
    public void testCustomerPurse() {
        assertEquals(50, customer.getPurse());
    }

    @Test
    public void testTicketBalance() {
        assertEquals(10, customer.getTickets());
    }

    @Test
    public void testCustomerIsTallEnough() {
        assertEquals(true, customer.meetsHeightReq(ride));
    }

    @Test
    public void testCustomerHasEnoughTickets() {
        assertEquals(true, customer.hasEnoughTickets(ride));
    }

    @Test
    public void testCustomerRedeemTickets() {
        assertEquals(5, customer.redeemTickets(ride));
    }
}
