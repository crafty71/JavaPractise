package Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("data01");
    strings.add("bb");
    strings.add("ccc");
    strings.sort(getComparator());
    System.out.println(strings);
  }

  private static Comparator<String> getComparator() {
    return Comparator.comparingInt(String::length);
  }
}
