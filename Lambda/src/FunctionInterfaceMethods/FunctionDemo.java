package FunctionInterfaceMethods;

import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {
    String ss = "coder,33";
    convert(ss, s -> s.split(",")[1],
        Integer::parseInt, i ->
            i + 70);
  }

  public static void convert(String s, Function<String, String> fun1,
      Function<String, Integer> fun2,
      Function<Integer, Integer> fun3) {
    int i = Integer.parseInt(String.valueOf(fun1.andThen(fun2).andThen(fun3).apply(s)));
    System.out.println(i);
  }
}
