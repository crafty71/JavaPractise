package String;

public class AaaryToString {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String ss = arrayToString(arr);

        System.out.println(ss);
    }


    public  static  String arrayToString(int[] arr) {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i < arr.length; i ++) {
            if ( i == arr.length -1) {
                s.append(arr[i]);
            }else {
                s.append(arr[i]);
                s.append(",");
            }
        }

        s.append("]");

        return s.toString();

    }
}
