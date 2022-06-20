package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("javaee");
//        arr.remove("javaee");
//        arr.clear();
        System.out.println( arr.contains("javaee"));
        System.out.println( arr.isEmpty());
        System.out.println( arr.size());

        System.out.println(arr);
    }
}
