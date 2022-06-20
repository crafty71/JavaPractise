package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ss = new LinkedList<>();
        ss.add("hello");
        ss.add("world");
        ss.add("javaee");
        ss.addFirst("java");
        ss.addLast("javascript");
        System.out.println(ss.get(1));
        System.out.println(ss.getLast());
        System.out.println(ss.removeFirst());
        System.out.println(ss.removeLast());
        System.out.println(ss.pop());
        ss.push("java");
        for(String s : ss) {
            System.out.println(ss);
        }
        while(!ss.isEmpty()){
            System.out.println(ss.pop());
        }

        System.out.println(ss);
    }
}
