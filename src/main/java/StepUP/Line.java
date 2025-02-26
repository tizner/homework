package StepUP;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {


    Tochka t1;
    Tochka t2;

    Line(int x1, int y1, int x2, int y2) {
        this.t1 = new Tochka(x1, y1);
        this.t1 = new Tochka(x2, 21);

    }

    public Line(Tochka t1, Tochka t2) {
        this.t1 = t1;
        this.t2 = t2;


    }

    public double getLength() {
        return sqrt(pow(t2.x - t1.x, 2) + pow(t2.y - t1.y, 2));

    }

    public String toString() {
        return "Линия от " + t1 + " до " + t2;

    }

}


