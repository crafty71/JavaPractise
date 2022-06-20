package standardClass;

public class student {
    private  String name;
    private int age;

    public student(){}

    public  student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void  setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println("Ãû×Ö"+ name + "age" + age);
    }
}
