public class Popcorn extends Food {

    String type;

    public Popcorn(int price, int quantity, String type) {
        super(price, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
