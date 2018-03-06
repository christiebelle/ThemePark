public class HotDog extends Food {

    String kind;

    public HotDog(int price, int quantity, String kind) {
        super(price, quantity);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}
