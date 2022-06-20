package ProductCustom;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Product p = new Product(b);

        Customer c = new Customer(b);

        Thread p1 = new Thread(p);

        Thread c1 = new Thread(c);

        p1.start();

        c1.start();
    }
}
