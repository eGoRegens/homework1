import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата:");
        double x = s.nextDouble();
        System.out.println("Площадь квадрата равна: " + x * x);
    }
}
