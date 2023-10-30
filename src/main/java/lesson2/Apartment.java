package lesson2;

public class Apartment {
    public static void main(String[] args) {
        int apartmentPrice = 8900000;
        double downPaymentPercentage = 15.5;
        double downPaymentAmount = (apartmentPrice * downPaymentPercentage) / 100;  // сумма первоначального взноса

        int downPaymentInteger = (int) downPaymentAmount;  //округление

        System.out.println("Стоимость квартиры составляет " + apartmentPrice + " у.е.");
        System.out.println("Требуемый процент первоначального взноса " + downPaymentPercentage + "% от стоимости квартиры.");
        System.out.println("Сумма первоначального взноса составит = " + downPaymentInteger + " у.е.");
    }
}
