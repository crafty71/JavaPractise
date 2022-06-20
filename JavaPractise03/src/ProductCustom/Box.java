package ProductCustom;

public class Box {
    private int milk;

    private Boolean state = false;

    synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        state = true;

        notifyAll();
    }

    synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者拿到第" + this.milk + "瓶奶");

        state = false;

        notifyAll();
    }
}
