package ListPractise;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> ss = new ArrayList<>();
        ss.add("hello");
        ss.add("world");
        ss.add("javaee");
        ss.add(2,"java");
//        ss.remove(2);
        ss.set(2, "javascript");
        for(String s : ss){
            System.out.println(s);
        }
        System.out.println(ss);
    }
}
