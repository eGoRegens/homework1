package lesson2;

public class Cup {
    public static void main(String[] args) {
        int glassVolumeMilliliters = 200;
        double glassFull = 51.2;
        double volumeWater = (glassVolumeMilliliters * glassFull) / 100;

        System.out.println("Сейчас в стакане " + volumeWater + " мл воды.");

    }
}
