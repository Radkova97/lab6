package blogic;

public class FFHelp {

    // треугольник?
    public static boolean isTriangle(double a, double b, double c) {
        return c < a + b && b < c + a && a < c + b;
    }

    // параллелограммом?
    public static boolean isParallelogram(int alfa, int betta) {
        return alfa + betta == 180;
    }

    // площадь треугольника
    public static double triangleArea(double a, double b, double c, int al) {
        if (al == 90) {
            return 0.5 * a * b;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //площадь параллелограмма
    public static double parallelArea(double a, double b, int al) {
        return a * b * Math.sin(Math.toRadians(al));
    }
}
