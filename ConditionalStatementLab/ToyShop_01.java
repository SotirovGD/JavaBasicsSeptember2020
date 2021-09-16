package ConditionalStatementLab;

import java.util.Scanner;

public class ToyShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаваме си променливите които ще 4етем от конзолата
        //50 или повече игра4ки магазинът прави отстъпка 25% от общата цена
        //трябва да плати 10% от общата цена за наем
        // 4етем :
        // Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        // Брой пъзели - цяло число в интервала [0… 1000]
        // Брой говорещи кукли - цяло число в интервала [0 … 1000]
        // Брой плюшени мечета - цяло число в интервала [0 … 1000]
        // Брой миньони - цяло число в интервала [0 … 1000]
        // Брой камиончета - цяло число в интервала [0 … 1000

       /* double puzzlePrice = 2.60;
        int dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        int truckPrice = 2;*/


        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int numPuzzle = Integer.parseInt(scanner.nextLine());
        int numDoll = Integer.parseInt(scanner.nextLine());
        int numBear = Integer.parseInt(scanner.nextLine());
        int numMinion = Integer.parseInt(scanner.nextLine());
        int numTruck = Integer.parseInt(scanner.nextLine());

        double orderToys = numPuzzle + numDoll + numBear + numMinion + numTruck;

        double costToys = numPuzzle * 2.60 + numDoll * 3 + numBear * 4.10 + numMinion * 8.20 + numTruck * 2;

        //50 или повече игра4ки магазинът прави отстъпка 25% от общата цена

        if ( orderToys >= 50 ){
            costToys = costToys - costToys * 0.25;
        }
        costToys = costToys - costToys * 0.10;

        if ( costToys >= holidayPrice){
            System.out.printf("Yes! %.2f lv left.",costToys-holidayPrice);
        }else{

            System.out.printf("Not enough money! %.2f lv needed.",holidayPrice - costToys);
        }







    }
}







