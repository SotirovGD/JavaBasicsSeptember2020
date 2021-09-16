package FirstStepsInCodingExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  VacationBookList {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //1. Да пресметнем колко 4аса на ден трябва да 4ете
        //2, създаваме си нужните променливи : общи страници на книгата,брой стран. за 4ас,броят на дните
        //3, 1-общите страници от книгата за 4етене и го делим на 4асовете който са 20 ( от конзолата )
        //4, 2-полу4еният рез. го делим на броят дни ( от конзолата ) за да разберем нужните 4асове на ден

        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysPerRead = Integer.parseInt(scanner.nextLine());

        int hoursPerRead = pagesBook / pagesPerHour;
        int bookReading = hoursPerRead / daysPerRead;
        System.out.println( bookReading);






    }
}
