package StepUP;

public class StartClasses {
    public static void main(String[] args) {
        Tochka t1 = new Tochka(1,3);
        Tochka t2 = new Tochka(4,7);

        Line l1 = new Line(1,1,2,2);
        Line l2 = new Line(t1, t2);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.getLength());
        System.out.println(l2.getLength());


    }
}
