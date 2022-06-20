package InterfaceMethods;

public class InterfaceDemo {
    public static void main(String[] args) {
        useInterface(() -> {
            System.out.println("cat eating");
        });
    }

    private static void useInterface(Interface i) {
        i.eat();
        i.run();
        Interface.play();
    }
}
