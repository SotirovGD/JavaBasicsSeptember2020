package FirstStepsInCodingLab;

import java.util.Scanner;

public class SquareArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 да създадем променлива която ще про4етем от конзолата
        // 2 да направим решението
        int area = Integer.parseInt(scanner.nextLine());
        int squareArea = area * area;
        System.out.println( squareArea );
    }
}
