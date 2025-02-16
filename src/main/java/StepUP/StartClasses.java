package StepUP;

public class StartClasses {
    public static void main(String[] args) {
        Tochka t1 = new Tochka(1,3);
        Tochka t2 = new Tochka(1,3);
        Tochka t3 = new Tochka(5,8);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1==t2);
        System.out.println(t1==t3);

    }
}
