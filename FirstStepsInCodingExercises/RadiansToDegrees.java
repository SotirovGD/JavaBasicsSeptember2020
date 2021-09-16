package FirstStepsInCodingExercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1, Променлива за Радиани в double
        // 2. Написваме/исползваме формулата зададена
        // 3, Принтираме
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180/Math.PI;

        System.out.printf(" %.0f",degrees);








    }
}

