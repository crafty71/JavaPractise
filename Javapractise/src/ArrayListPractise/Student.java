package ArrayListPractise;

public class Student {
    String name;
    String age;

    public void Student(){};

    public void Student(String age,String name){
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
