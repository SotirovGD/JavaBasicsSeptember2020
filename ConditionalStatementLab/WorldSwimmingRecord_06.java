package ConditionalStatementLab;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // тотално време в секунди
        // Разстоянието в метри
        // Времето в секунди, за което плува разстояние от 1 м.

        double worldRecord = Double.parseDouble(scanner.nextLine()); //10464 сек
        double distance = Double.parseDouble(scanner.nextLine()); // 1500m
        double timeInSec = Double.parseDouble(scanner.nextLine());//20 сек за м

        double distanceInSec = distance * timeInSec; // дистанция за плуване в секунди 30000 сек
        double retard = Math.floor(distance / 15); // забавянето му 100
        double retardInSec = retard * 12.5; // забавянето му за 1500 м = 12500 сек

        double totalTime = distanceInSec + retardInSec;


        /*if (worldRecord < totalTime){
            double neededTime = Math.floor(totalTime - worldRecord);
            System.out.printf("No, he failed! He was %.2f seconds slower.",neededTime);
        }else {
            double newRecord = distanceInSec + retardInSec;
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",newRecord);
          }*/

        if( totalTime<worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else {
            double neededTime = totalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.",neededTime);
        }




    }
}
