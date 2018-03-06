public class Customer {

    private String name;
    private double height;
    private int purse;
    private int tickets;

    public Customer(String name, double height, int purse, int tickets) {
        this.name = name;
        this.height = height;
        this.purse = purse;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public boolean meetsHeightReq(Ride ride) {
        if(this.height >= ride.getMinHeight()) {
            return true;
        }else{
            return false;
        }
    }

    public boolean hasEnoughTickets(Ride ride) {
        if(this.tickets >= ride.getTickets()) {
            return true;
        }else {
            return false;
        }
    }

    public int redeemTickets(Ride ride){
        if(hasEnoughTickets(ride)){
            int newbalance = getTickets() - ride.getTickets();
            setTickets(newbalance);
        }
        return this.tickets;
    }
}
