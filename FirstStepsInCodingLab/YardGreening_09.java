package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //1. създаваме си променлива
        //2, 1 кв/м струва 7,61лв
        //3, фирмата и прави 18% отстъпка от крайната цена
        //4, кв/м за озеленяване са 550

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double meterToGreening = squareMeters * 7.61;
        double discount = meterToGreening - 0.18 * meterToGreening;
        double lastPrice = meterToGreening - discount;
        System.out.printf("The final price is: %.2f lv.",discount);

        System.out.printf("The discount is: %.2f lv.",lastPrice);





    }
}

