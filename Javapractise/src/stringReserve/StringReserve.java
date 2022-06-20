package stringReserve;

import java.util.Scanner;

public class StringReserve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");

        String line = sc.nextLine();

        String ss = reverse(line);

        System.out.println(ss);
    }


    public static String reverse( String s) {
        StringBuilder ss = new StringBuilder();

        for( int i = s.length()-1; i >= 0; i--) {
            ss.append(s.charAt(i));
        }

        return ss.toString();
    }
}
