package PackageImport;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请您输入内容");

        String line = sc.nextLine();

        System.out.println("您输入的内容是"+ line);
    }
}
