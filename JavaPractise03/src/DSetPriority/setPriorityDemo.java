package DSetPriority;

public class setPriorityDemo {
    public static void main(String[] args) {
        MyThread myThread01 = new MyThread();
        Thread thread01 = new Thread(myThread01);
        thread01.setName("飞机");
//        线程优先级
        thread01.setPriority(10);
        MyThread myThread02 = new MyThread();
        Thread thread02 = new Thread(myThread02);
        thread02.setName("高铁");
        thread02.setPriority(5);
        MyThread myThread03 = new MyThread();
        Thread thread03 = new Thread(myThread03);
        thread03.setName("汽车");
        thread03.setPriority(1);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
