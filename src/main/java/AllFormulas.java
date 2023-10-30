public class AllFormulas {
    public static void main(String[] args) {
        double lengthSquare = 10;      //длина стороны квадрата
        SquareSpace(lengthSquare);
        TriangleSpace(2.5, 7);     // 2-основание(a), 7-высота(h)
        CircleSpace(2);         // радиус
    }

    public static void SquareSpace(double length) {
        double space = length * 2;
        System.out.println("площадь квадрата равняется - " + space);
    }

    public static void TriangleSpace(double a, double h) {
        double space = (a * h) / 2;
        System.out.println("Площадь треугольника равняется - " + space);

    }

    public static void CircleSpace(double radius) {
        double space = Math.PI * radius * radius;
        System.out.println("Площадь круга - " + space);

    }
}