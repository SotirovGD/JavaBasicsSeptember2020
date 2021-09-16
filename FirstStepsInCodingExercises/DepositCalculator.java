package FirstStepsInCodingExercises;
import java.util.Scanner;


public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. да създадем променлива
        //2, депозираната сума е double 4исло
        //3, срока на депозит е int 4исло
        //1. изчисляваме натрупаната лихва: 200 * 5.7% = 11.4лв.
        //2. изчисляваме лихвата за 1 месец: 11.4лв./12 месеца = 0.95лв
        //3. общата сума е 200лв депозит + (3 (срок на депозита) * 0.95 лв)
        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)


        double depositSum = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double Percent = Double.parseDouble(scanner.nextLine());

        double dividentPerYear = depositSum * (Percent / 100);
        double dividentPerMonth = dividentPerYear  /12;
        double sum = depositSum + month * dividentPerMonth;
        System.out.println( sum );





    }
}

