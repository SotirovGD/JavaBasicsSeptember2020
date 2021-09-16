package ConditionalStatementLab;

import java.util.Scanner;

public class Number100_200_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. да се напише 4исло което да се провери дали е под 100 м/у 100 и 200 или над 200
        int number = Integer.parseInt(scanner.nextLine());

        if ( number < 100){
            System.out.println("Less than 100");
        }else if ( number <= 200 ){
            System.out.println("Between 100 and 200");
        }else if ( number >= 200 ){
            System.out.println("Greater than 200");
        }
    }

}
