package Interface;

public class Carts implements  Animal{
    private String name;
    private  int age;

    public Carts() {
    }

    public Carts(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eating() {
        System.out.println("√®≥‘”„");
    }

    @Override
    public String toString() {
        return "Carts{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
