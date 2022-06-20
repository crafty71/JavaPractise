package StreamDemo;

import java.util.ArrayList;

public class Limit {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("java");
    list.add("cpdd");
    list.stream().limit(2).forEach(System.out::println);
    list.stream().skip(5).forEach(System.out::println);
  }

}
