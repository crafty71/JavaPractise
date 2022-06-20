package ArrayListPractise;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add(2,"java");
//        array.remove("world");
//        System.out.println(array.remove(1));
//        System.out.println(array.set(2,"javaee"));
        System.out.println(array.get(1));
        System.out.println(array.size());
        System.out.println(array);
        int num = array.size();
        for(int index = 0; index < num; index++){
            String s = array.get(index);
            System.out.println(s);
        }
    }
}
