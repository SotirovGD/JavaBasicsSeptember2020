package FirstStepsInCodingExercises;
import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. да си напишем променливите
        // ЦЕНАТА НА ЗАЛАТА Е 2250
        //2, торта - цената й е 20% от залата
        //3, напитки - цената им е 45% от тази на тортата
        //4, аниматор - цената му е 1/3 от цената на залата

        int hallPrice = Integer.parseInt(scanner.nextLine());

        double cakePrice = hallPrice * 0.20;
        double drinksPrice = cakePrice - 0.45 * cakePrice;
        double animator = hallPrice / 3;
        double partyPrice = hallPrice + cakePrice + animator + drinksPrice;

        System.out.println(partyPrice);

    }
}
