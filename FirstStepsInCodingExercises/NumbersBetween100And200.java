import java.util.Scanner;

public class NumbersBetween100And200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if ( number < 100) {
            System.out.println("ok");
        }else{
            System.out.println("error");
        }

        }
    }

