package methodReference;

public class methodReferenceDemo {
    public static void main(String[] args) {
        useInterface(Integer::sum);
        Methods methods = new Methods();
        useMethods(methods);
    }


    static void useInterface(methodReferenceInterface s) {
        int sum = s.add(10, 20);
        System.out.println(sum);
    }

    static void useMethods(Methods s) {
        int sub = s.sub(10, 20);
        System.out.println(sub);
    }
}
