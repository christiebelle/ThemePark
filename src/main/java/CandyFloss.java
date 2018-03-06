public class CandyFloss extends Food {

    String flavour;

    public CandyFloss(int price, int quantity, String flavour) {
        super(price, quantity);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
