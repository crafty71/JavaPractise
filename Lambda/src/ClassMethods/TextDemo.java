package ClassMethods;

public class TextDemo {
    public static void main(String[] args) {
        PrintString ps = new PrintString();
        UsePrint(ps::Print);
    }

    private static void UsePrint(Print s) {
        s.getString("hello world");
    }
}
