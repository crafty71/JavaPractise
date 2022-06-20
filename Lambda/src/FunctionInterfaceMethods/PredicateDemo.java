package FunctionInterfaceMethods;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) {
    String[] strArray = {"initialling,30", "hangman,35", "zugzwang,33"};
    ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length() > 6,
        s -> Integer.parseInt(s.split(",")[1]) > 33);

    System.out.println(array);
  }


  public static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1,
      Predicate<String> pre2) {
    ArrayList<String> array = new ArrayList<>();
    for (String str : strArray) {
      if (pre1.and(pre2).test(str)) {
        array.add(str);
      }
    }
    return array;
  }
}
