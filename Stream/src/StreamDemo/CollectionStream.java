package StreamDemo;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStream {

  public static void main(String[] args) {
    String[] strArray = {"Jack,30", "Tom,35", "coder,28", "why,18"};

    Stream<String> stringStream = Stream.of(strArray)
        .filter(s -> Integer.parseInt(s.split(",")[1]) > 26);

    Map<String, String> collect = stringStream.collect(
        Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));

    Set<String> strings = collect.keySet();

    for (String key : strings) {
      String s = collect.get(key);
      System.out.println(key + " " + s);
    }
  }


}
