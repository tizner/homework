package StepUP;

public class Arr {
    public static void main(String[] args) {
        int x = 2;
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findLast(arr, x));

    }

    ;
    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i] == x)
                return i;
        };
        return -1;
    };




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
