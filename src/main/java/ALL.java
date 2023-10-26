public class ALL {
    public static void main(String[] args) {
        lengthSquare(4);
        valuesTringle(5, 3);     // 5-основание(a), 3-высота(h)
        radiusCircle(1.7);
    }

    public static void lengthSquare(double length) {
        double space = length*length;
        System.out.println("площадь квадрата равняется - "+space);
    }

    public static void valuesTringle(double a, double h) {
        double space = (a*h)/2;
        System.out.println("Площадь треугольника равняется - "+ space);

    }

    public static void radiusCircle(double radius) {
        double space =Math.PI*radius*radius;
        System.out.println("Площадь круга - "+space);

    }
}
