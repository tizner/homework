package StepUP;

import static java.lang.Math.abs;

public class Arr {
    public static void main(String[] args) {

        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(maxAbs(arr));

    }

    ;

    public static int maxAbs(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) > max)
                max = arr[i];
        }
        return max;
    }

    ;

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x)
                return i;
        }
        ;
        return -1;
    }

    ;


    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        ;
        return -1;
    }

    ;


}
