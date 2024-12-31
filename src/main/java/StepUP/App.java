package StepUP;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(lastNumSum(1,lastNumSum(14,lastNumSum( 123,lastNumSum(5,11)))));
    }


    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }



}





