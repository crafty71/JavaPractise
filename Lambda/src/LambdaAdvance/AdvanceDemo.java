package LambdaAdvance;

public class AdvanceDemo {
    public static void main(String[] args) {
        useTint(Integer::parseInt);
    }

    private  static void  useTint(StringToInt c) {
        int tint = c.Tint("666");
        System.out.println(tint);
    }
}
