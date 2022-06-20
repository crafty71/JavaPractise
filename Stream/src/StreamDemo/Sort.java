package StreamDemo;




import java.util.ArrayList;

public class Sort {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("java");
    list.add("cpdd");
    list.add("news");

    list.stream().sorted((s1, s2) -> {
      int num = s1.length() - s2.length();
      return num == 0 ? s1.compareTo(s2) : num;
    }).forEach(System.out::println);
  }

}
