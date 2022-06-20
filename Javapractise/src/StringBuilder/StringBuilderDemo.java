package StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder hello = new StringBuilder("hello");
        System.out.println(hello.append(100));
        System.out.println(hello.reverse());

        String ss = "mua";
        StringBuilder s1 = new StringBuilder(ss);
        s1.append(200);
        System.out.println(s1.reverse());

        StringBuilder hello_world = new StringBuilder("hello world");

        hello_world.append(100);

        String s2 = hello_world.toString();

        System.out.println(s2);

    }


}
