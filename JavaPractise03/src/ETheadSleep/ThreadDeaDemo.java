package ETheadSleep;

public class ThreadDeaDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep("关羽");
        ThreadSleep ts2 = new ThreadSleep("张飞");
        Thread.currentThread().setName("刘备");
        //        设置守护线程
        ts1.setDaemon(true);
        ts2.setDaemon(true);
        ts1.start();
        ts2.start();



        for (int i = 0; i < 7; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
