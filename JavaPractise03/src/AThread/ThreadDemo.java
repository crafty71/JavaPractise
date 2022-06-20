package AThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread newThread = new MyThread("线程1");
        MyThread newThread2 = new MyThread("线程2");
        newThread.start();
        newThread2.start();
    }
}
