package CRunnable;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        MyRunnable runnable01 = new MyRunnable();
        Thread thread01 = new Thread(runnable01);
        thread.start();
        thread01.start();
    }
}
