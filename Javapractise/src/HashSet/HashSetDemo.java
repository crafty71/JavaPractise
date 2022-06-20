package HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> ss = new HashSet<>();
        ss.add("hello");
        ss.add("world");
        ss.add("java");
        for (String s : ss) {
            System.out.println(s);
        }

        HashSet<Student> studentList = new HashSet<Student>();

        Student s1 = new Student("coderwhy", 18);
        Student s2 = new Student("crafty", 19);
        Student s3 = new Student("д╬д╬вс", 20);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);

        System.out.println(ss);
    }
}
