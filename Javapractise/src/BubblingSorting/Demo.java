package BubblingSorting;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayList arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        methods.sort(arr);
        System.out.println(methods.sort(arr));
    }
}
