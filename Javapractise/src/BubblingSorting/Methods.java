package BubblingSorting;

import java.util.ArrayList;

public class Methods {
    public  static ArrayList<Integer> sort(ArrayList<Integer> arr){
        for(int x = 0 ; x < arr.size(); x++) {
            for(int y = 0; y <= arr.size() - 1; y ++) {
                int a = arr.get(y);
                int b  = arr.get(y+1);
               if(a > b) {
                   int temp = a;
                   a = b;
                   b = temp;
               }
            }
        }
        return  arr;
    }
}
