package lesson2;

public class Apple {
    public static void main(String[] args) {
        int applesBuranino = 5;
        int applesTookKarabas = 2;
        int residualApplesBuratino = applesBuranino - applesTookKarabas;

        System.out.println("У Буратино изначально было " + applesBuranino + " яблок.");
        System.out.println("Карабас Барабас отобрал у него " + applesTookKarabas + " яблок.");
        System.out.println(residualApplesBuratino + " яблок(а) осталось у Буратино.");
    }
}
