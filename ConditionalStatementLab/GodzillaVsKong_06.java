package ConditionalStatementLab;

import java.util.Scanner;

public class GodzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Бюджет за филма – реално число в интервала
        // Брой на статистите – цяло число в интервала
        // Цена за облекло на един статист – реално число в интервала

        // Декорът за филма е на стойност 10% от бюджета.
        // При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        // да навържа ифовете ако статистите са пове4е от 150
        // да сметна ако парите стигат и накрая ако не стигат !!

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double clothPrice = statists * clothPricePerStatist;



        //if ( budget >= totalCost ){
        //System.out.printf("Action! Wingard starts filming with %.2f leva left.",totalCost);


        if (statists > 150) {
             clothPrice = clothPrice - 0.10 * clothPrice;
        }
        double totalCost = decorPrice + clothPrice;
        if (budget >= totalCost){
            System.out.println("Action!");
           double leftMoney = budget - totalCost;
            System.out.printf("Wingard starts filming with %.2f leva left.",leftMoney );
        }else {
            double neededMoney = totalCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",neededMoney);
        }




































    }




}


