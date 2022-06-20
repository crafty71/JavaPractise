package FunctionInterfaceMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();
    Random r = new Random();
    for (int i = 0; i < 6; i++) {
      integers.add(r.nextInt(100));
    }
    for (Integer I : integers) {
      System.out.println(I);
    }
    System.out.println("----------");
    int max = getMax(() -> Collections.max(integers));
    System.out.println(max);
  }

  private static int getMax(Supplier<Integer> s) {
    return s.get();
  }
}
