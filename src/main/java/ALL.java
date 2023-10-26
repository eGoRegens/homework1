public class ALL {
    public static void main(String[] args) {
        squareLength(4);
        valuesTringle(5, 3);     // 5-основание(a), 3-высота(h)
    }

    public static void squareLength(double length) {
        double space = length*length;
        System.out.println("площадь квадрата равняется - "+space);
    }

    public static void valuesTringle(double a, double h) {
        double space = (a*h)/2;
        System.out.println("Площадь треугольника равняется ");

    }
}
