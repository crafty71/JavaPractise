package FunctionInterfaceMethods;

import java.util.function.Consumer;

public class ConsumerDemo {

  public static void main(String[] args) {
    String[] strArray = {"initialling,30", "hangman,35", "zugzwang,33"};

    printInfo(strArray, (String str) -> {
      String name = str.split(",")[0];
      System.out.println(name);
    },(String str) ->{
      int age = Integer.parseInt(str.split(",")[1]);
      System.out.println(age);
    });
  }

  private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
    for (String str : strArray) {
      con1.andThen(con2).accept(str);
    }
  }
}
