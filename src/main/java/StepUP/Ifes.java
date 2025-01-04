package StepUP;

import static java.lang.Math.abs;

public class Ifes {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        //System.out.println(square(x));
        //square(x);
        //leftTriangle(x);
        //rightTriangle(x);
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        int count = 1;
        boolean game = true;

        while(game) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                count++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Колличество попыток:" + count);
                game = false;
            };
        };
    };



    public static String listNums(int x) {
        String str = "";
        int i = 0;

        for (; i < x; i++)
            str += i + " ";

        return str += x;
    }

    ;

    public static String reverseListNums(int x) {
        String str = "";
        int i = x;

        for (; i > 0; i--)
            str += i + " ";

        return str += 0;
    }

    ;

    public static String chet(int x) {
        String str = "";
        for (int i = 0; i <= x; i += 2)
            str += i + " ";

        return str;
    }

    ;

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++)
            result *= x;
        return result;
    }

    ;

    public static int numLen(long x) {
        int result = 0;
        do {
            x /= 10;
            result++;
        } while (x > 0);
        return result;
    }

    ;

    public static boolean equalNum(int x) {
        x = abs(x);
        int a = x % 10;
        boolean result = false;
        do {

            if (x % 10 == a)
                result = true;
            else {
                result = false;
                break;
            }
            x /= 10;
        } while (x > 0);

        return result;

    }

    ;
    public static void square(int x){
        for (int i=0; i< x; i++ ){
            for (int j = 0; j<x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    };

    public static void leftTriangle(int x){
        for (int i=0; i< x; i++ ){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    };

    public static void rightTriangle(int x){
        for (int i=0; i< x; i++ ){
            for (int j = 1; j<x-i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    };

}
