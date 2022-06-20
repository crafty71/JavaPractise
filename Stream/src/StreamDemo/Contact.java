package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Contact {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("java");
    list.add("cpdd");
    list.add("news");

    Stream<String> limit = list.stream().limit(6);
    Stream<String> skip = list.stream().skip(4);
    Stream.concat(limit, skip).distinct().forEach(System.out::println);
  }

}
