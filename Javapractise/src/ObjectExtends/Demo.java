package ObjectExtends;

public class Demo {
    public static void main(String[] args) {
        animal cat = new Cat();
        cat.running();
        cat.eating();
        Dog dog = new Dog();
        dog.eating();
        dog.running();
    }
}
