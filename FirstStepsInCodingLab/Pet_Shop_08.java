package FirstStepsInCodingLab;

import java.util.Scanner;

public class Pet_Shop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //1. Броят на кучетата – цяло число в интервала
        //2. Броят на останалите животни  - цяло число в интервала
        double dogFood = 2.50;
        double anotherFood = 4;

        double dogs = Double.parseDouble(scanner.nextLine());
        double restAnimals = Double.parseDouble(scanner.nextLine());

        double dogSum = dogFood * dogs;
        double restAnimalSum = anotherFood * restAnimals;
        double endSum = dogSum + restAnimalSum;

        System.out.printf( " %.1f lv.",endSum );
    }
}
