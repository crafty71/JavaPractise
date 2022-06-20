package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectInserctor {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("javaee");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
