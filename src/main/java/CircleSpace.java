import java.util.Scanner;
public class CircleSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину радиуса");
        double radius = s.nextDouble();
        double result = ((radius*radius)*Math.PI);
        System.out.println("Площадь круга - " + result);
    }
}
