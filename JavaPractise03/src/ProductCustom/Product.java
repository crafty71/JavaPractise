package ProductCustom;

public class Product implements Runnable {
    private Box b;

    public Product(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.put(i);
        }
    }
}
