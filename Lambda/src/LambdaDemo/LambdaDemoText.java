package LambdaDemo;

public class LambdaDemoText {
    public static void main(String[] args) {
        // 匿名内部类
        Usecron(new Running() {
            @Override
            public void run() {
                System.out.println("cat eating");
            }
        });

        // lambda 表达式
        Usecron(() ->{
            System.out.println("cat eating");
        });
    }

    public static void Usecron(Running e) {
        e.run();
    }
}
