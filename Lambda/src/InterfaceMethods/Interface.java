package InterfaceMethods;

public interface Interface {
    void run();

    default void eat() {
        System.out.println("eating fruit");
    }

    static void play() {
        System.out.println("play game");
    }
}
