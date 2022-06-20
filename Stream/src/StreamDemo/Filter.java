package StreamDemo;

import java.util.ArrayList;
import java.util.Random;

public class Filter {

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();
    Random r = new Random();
    for (int i = 0; i < 6; i++) {
      integers.add(r.nextInt(100));
    }
    integers.stream().filter(i -> i > 70).forEach(System.out::println);
  }
}
