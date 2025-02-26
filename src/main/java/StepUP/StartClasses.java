package StepUP;

public class StartClasses {
    public static void main(String[] args) {

        Tochka t1 = new Tochka(1,3);
        Tochka t2 = new Tochka(5,8);
        Tochka t3 = new Tochka(10,11);
        Tochka t4 = new Tochka(15,19);


        Line l1 = new Line(t1, t2);
        Line l2 = new Line(t3, t4);
        Line l3 = new Line(t2, t3);

        System.out.println(l3);
        System.out.println(t2);
        System.out.println(t3);
        t2.x = 6;
        t2.y = 9;
        t3.x = 11;
        t3.y = 12;
        System.out.println("--------");
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(l3);
        System.out.println("--------");
        System.out.println(l1.getLength() + l2.getLength()+ l3.getLength());


    }
}
