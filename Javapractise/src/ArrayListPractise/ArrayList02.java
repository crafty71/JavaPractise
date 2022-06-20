package ArrayListPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        addStudent(students);
        addStudent(students);
        for(int i = 0 ; i < students.size(); i++) {
            System.out.println(students.get(i).getAge());
            System.out.println(students.get(i).getName());
        }
    }


    public static void addStudent(ArrayList<Student> students){

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生姓名");

        String name = scanner.nextLine();

        System.out.println("请输入学生姓名");

        String age = scanner.nextLine();

        Student s = new Student();

        s.Student(name,age);

        students.add(s);

    }
}
