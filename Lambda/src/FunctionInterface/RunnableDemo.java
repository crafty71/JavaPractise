package FunctionInterface;

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(() -> System.out.println(Thread.currentThread().getName() + " " + "is starting"));
    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
