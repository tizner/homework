package StepUP;

import static java.lang.Math.abs;

public class Arr {
    public static void main(String[] args) {

        int[] arr = {1,-2,-7,4,-7,-2,1};
        System.out.println(palindrom(arr));

    }

    ;

    public static boolean palindrom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length-1 - i])
                return false;
        }
        return true;
    }

    ;


    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
        }
        return count;
    }

    ;


    public static int maxAbs(int[] arr) {
        int max = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) > max) {
                max = abs(arr[i]);
                y = i;
            }
        }
        return arr[y];
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
