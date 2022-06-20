package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> ss = new LinkedHashSet<>();
        ss.add("hello");
        ss.add("world");
        ss.add("java");
        System.out.println(ss);
    }
}
