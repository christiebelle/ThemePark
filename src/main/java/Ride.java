public abstract class Ride {

    private final String name;
    private final int tickets;
    private final int capacity;
    private final double minHeight;

    public Ride(String name, int tickets, int capacity, double minHeight) {
        this.name = name;
        this.tickets = tickets;
        this.capacity = capacity;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public int getTickets() {
        return tickets;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMinHeight() {
        return minHeight;
    }
}

//Extensions;
//Expand the model in whichever direction you like. Add different types of ride, create a queuing system.
