package Lambda;

public class LambdaExpress {
    public static void main(String[] args) {
        useAdd((x, y) -> x + y
        );
    }

    private static void useAdd(AddNum a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
