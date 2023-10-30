package lesson2;

public class Apartment {
    public static void main(String[] args) {
        int apartmentPrice = 8900000;
        double downPaymentPercentage = 15.5;
        double downPaymentAmount = (apartmentPrice * downPaymentPercentage) / 100;

        int downPaymentInteger = (int) downPaymentAmount;

        System.out.println("Сумма первоначального взноса составит = " + downPaymentInteger);
    }
}
