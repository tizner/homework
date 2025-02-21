package StepUP;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {

        int x1;
        int y1;
        int x2;
        int y2;
        Tochka t1;
        Tochka t2;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Tochka t1, Tochka t2) {
        this.x1 = t1.x;
        this.y1 = t1.y;
        this.x2 = t2.x;
        this.y2 = t2.y;

    }
    public double getLength(){
        return sqrt(pow(x2-x1,2) + pow(y2-y1,2));

    }

    public String toString() {
        return "Линия от {" + x1 + ";" + y1 + "} до {" + x2+ ";" + y2 +"}";

    }



}


