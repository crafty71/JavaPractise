package BThreadName;

public class ThreadNameDemo {
    public static void main(String[] args) {
        MyThread thread_first = new MyThread("thread first");
        MyThread thread_second = new MyThread("thread second");
        thread_first.start();
        thread_second.start();
    }
}
