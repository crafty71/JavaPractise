package ETheadSleep;

// join 线程死亡

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadSleep ts1 = new ThreadSleep("康熙");
        ThreadSleep ts2 = new ThreadSleep("四阿哥");
        ThreadSleep ts3 = new ThreadSleep("八阿哥");
        ts1.start();
        ts1.join();
        ts2.start();
        ts3.start();
    }
}
