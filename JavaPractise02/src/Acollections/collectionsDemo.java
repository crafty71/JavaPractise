package Acollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(12);
        arr.add(11);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("ÎÒ°®Äã");
    }
}
