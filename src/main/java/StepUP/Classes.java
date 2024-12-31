package StepUP;

public class Classes {
    public static void main(String[] args) {


        int x = 5;
        int y = 7;
        int z = 3;


        //System.out.println(abs(x));
        System.out.println(sum2(x, y));
    }

    public static int sumLastNums(int x) {
        int x1 = x % 10;
        int x2 = (x / 10) % 10;
        return x1 + x2;

    }

    ;

    public static int charToNum(char x) {
        return (int) x - 48;
    }

    ;

    public static boolean isPositive(int x) {
        return x > 0;
    }

    ;


    public static boolean is2Digits(int x) {
        return (x / 10 >= 1) && (x / 10 <= 9);
    }

    ;

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    ;


    public static boolean isInRange(int a, int b, int num) {
        return (num <= b && num >= a) || (num >= b && num <= a);
    }

    ;

    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    ;

    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    ;

    public static int abs(int x) {
        if (x < 0)
            return -x;
        return x;
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    ;

    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }

    ;

    public static String makeDecision(int x, int y) {
        if (x > y)
            return x + " > " + y;
        else if (x < y)
            return x + " < " + y;
        return x + " == " + y;
    }

    ;

    public static int max3(int x, int y, int z) {
        int max = x;
        if (max < y)
            max = y;
        if (max < z)
            max = z;

        return max;

    }

    public static boolean sum3(int x, int y, int z) {
        if ((x == (y + z)) || (y == (x + z)) || (z == (x + y)))
            return true;
        return false;
    }

    ;;

    public static int sum2(int x, int y) {
        int sum = x + y;
        if ( (sum<=19) && (sum>=10) ) return 20;
        return sum;
    }

    ;



        public static boolean is35(int x) {
            if (((x % 3 == 0) || (x % 5 == 0)) && !((x % 3 == 0) && (x % 5 == 0)))
                return true;
            else
                return false;
        };
        public static boolean magic6(int x, int y)
        {
            if ((x == 6) || (y ==6) || (x+y == 6) || (x-y == 6) || (y-x == 6))
                return true;
            else
                return false;
        };
        public static String age(int x)
        {
            if ( (x%10==1) && !(x%100==11) )
                return x + " год";

            if (  ((x%10==2) || (x%10==3)  || (x%10==4)) && !(x%100==12) && !(x%100==13) && !(x%100==14))
                return x + " года";

            return x + " лет";
        };


        public static String day(int x){
            String str = "";
            switch (x) {
                case (1):
                    str = "Понедельник";
                    break;

                case (2):
                    str = "Вторник";
                    break;
                case (3):
                    str = "Среда";
                    break;
                case (4):
                    str = "Четверг";
                    break;
                case (5):
                    str = "Пятница";
                    break;
                case (6):
                    str = "Суббота";
                    break;
                case (7):
                    str = "Воскресенье";
                    break;
                default:
                    str = "Это не день недели";
                    break;
            };
            return str;
        };

        public static void printDays(String x){
            switch (x) {
                case ("понедельник"):
                    System.out.println("понедельник");
                case ("вторник"):
                    System.out.println("вторник");
                case ("среда"):
                    System.out.println("среда");
                case ("четверг"):
                    System.out.println("четверг");
                case ("пятница"):
                    System.out.println("пятница");
                case ("суббота"):
                    System.out.println("суббота");
                case ("воскресенье"):
                    System.out.println("воскресенье");
                    break;
                default:
                    System.out.println("Это не день недели");
                    break;
            };
        };




}


