import java.util.Arrays;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] arr = {100,120,175};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i : arr) {
            System.out.println(i);
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}
