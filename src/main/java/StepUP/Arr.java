package StepUP;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

public class Arr {
    public static void main(String[] args) {

        int []arr={1,2,3,8,2,2,9};
        int x=2;
        System.out.println(Arrays.toString(findAll(arr, x)));

    };
    public static int[] findAll(int[] arr, int x){
        int count= 0;
        for (int i =0; i< arr.length; i++){
            if (arr[i] == x)
                count++;
        }
        int[]arrRes = new int[count];
        int y=0;
        for (int i =0; i< arr.length; i++){
            if (arr[i] == x){
                arrRes[y++]=i;

            }
        }
        return arrRes;
    };



    public static int[] concat(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int[]arr = new int[len];
        for (int i = 0; i< arr1.length; i++){
            arr[i] = arr1[i];
        }
        for (int y = 0; y< arr2.length; y++){
            arr[arr1.length +y] = arr2[y];
        }
        return arr;
    };





    public static int[] reverseBack(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];

        }
        return arr2;
    };



    public static void reverse(int[] arr) {

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];

        }
        System.arraycopy(arr2, 0, arr, 0, arr.length);


    }

    ;

    public static boolean palindrom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i])
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
