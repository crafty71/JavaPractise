package standardClass;

public class studentDemo {
    public static void main(String[] args) {
        student s = new student();
        s.setName("coderwhy");
        s.setAge(20);
        student s1 = new student("уехЩ", 18);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        s.show();
        s1.show();
    }
}
