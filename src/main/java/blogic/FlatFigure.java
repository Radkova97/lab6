package blogic;

public class FlatFigure {
    double a, b, c, d;
    int al, bet;

    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (FFHelp.isTriangle(a, b, c)) {
            System.out.println("ok Triangle");
        } else {
            System.out.println("bad Triangle");
        }
    }

    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        this.al = alfa;
        this.c = FFHelp.isTriangle(a, b, alfa) ? Math.sqrt(a * a + b * b) : 0;
    }

    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al = alfa;
        this.bet = 180 - alfa;
    }

    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        this.al = alfa;
        this.bet = betta;

        if (FFHelp.isParallelogram(alfa, betta)) {
            System.out.println("ok Parallelogram");
        } else {
            System.out.println("bad Parallelogram");
        }
    }

    public double area() {
        if (isTriangle()) {
            return triangleArea();
        } else if (isParallelogram()) {
            return parallelArea();
        }
        return 0;  // Если фигура не определена
    }

    private boolean isTriangle() {
        return d == 0;
    }

    private boolean isParallelogram() {
        return d != 0;
    }

    private double triangleArea() {
        return FFHelp.triangleArea(a, b, c, al);
    }

    private double parallelArea() {
        return FFHelp.parallelArea(a, b, al);
    }
}
