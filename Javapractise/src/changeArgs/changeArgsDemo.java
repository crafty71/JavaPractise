package changeArgs;

public class changeArgsDemo {
    public static void main(String[] args) {
           Integer sum =  getSum(1,2,3,4,4,5);
        System.out.println(sum);
    }

    public  static  Integer  getSum (Integer ...arr) {
        int sum = 0;
          for(Integer a : arr) {
              sum = sum + a;
        }
          return sum;
    }
}
