package StudentManage;

public class Student {
    private  String name;
    private   String age;
    private  String id;
    private  String adress;


    public Student() {
    }

    public Student(String name, String age, String id, String adress) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
