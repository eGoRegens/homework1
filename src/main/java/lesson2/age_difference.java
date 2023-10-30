package lesson2;

public class age_difference {
    public static void main(String[] args) {
        long ageOfTheUniverse = 13000000000L;
        long ageOfTheHumans = 100000;
        long ageDifference = ageOfTheUniverse / ageOfTheHumans;

        System.out.println("Возраст вселенной " + ageOfTheUniverse + " лет.");
        System.out.println("Возраст человечества " + ageOfTheHumans + " лет.");
        System.out.println("Возраст вселенной больше в " + ageDifference + " раз больше возраста человечества.");

    }

}
