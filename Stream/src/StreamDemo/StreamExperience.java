package StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamExperience {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("周芷若");
    list.add("赵敏");
    list.add("张强");
    list.add("张三丰");
    list.stream().filter((s) -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(
        System.out::println);
  }

}
