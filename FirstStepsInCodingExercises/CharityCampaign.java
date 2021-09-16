package FirstStepsInCodingExercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. създаваме си променливите нужни за програмата
        //2, от конзолата ще се 4етат 5 реда !!
        //3, прочитаме от конзолата броя на дните, на кампанията и броя на сладкарите, които ще се включат.
        //    1. Броят на дните, в които тече кампанията
        //    2. Броят на сладкарите
        //    3. Броят на тортите
        //    4. Броят на гофретите
        //    5. Броят на палачинките

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int totalPastry = Integer.parseInt(scanner.nextLine());
        int numOfCakes = Integer.parseInt(scanner.nextLine());
        double numOfWaffles = Double.parseDouble(scanner.nextLine());
        double numbOfPancakes = Double.parseDouble(scanner.nextLine());

        int totalSumCakes = numOfCakes * 45;
        double totalSumWaffles = numOfWaffles * 5.80;
        double totalSumPancakes = numbOfPancakes * 3.20;
        double totalSumOfSweetsPerDay = totalSumCakes + totalSumWaffles + totalSumPancakes;
        double sumOfAllPastry = totalSumOfSweetsPerDay * totalPastry;
        double totalSum = sumOfAllPastry * campaignDays;
        double sumAfterCosts = totalSum / 8.0;
        double endSum = totalSum - sumAfterCosts;
        System.out.printf("%.2f",endSum);



















    }
}

