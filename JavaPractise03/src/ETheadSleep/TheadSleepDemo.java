package ETheadSleep;

public class TheadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep("曹操");
        ThreadSleep ts2 = new ThreadSleep("刘备");
        ThreadSleep ts3 = new ThreadSleep("孙权");
        ts1.start();
        ts2.start();
        ts3.start();
    }
}
