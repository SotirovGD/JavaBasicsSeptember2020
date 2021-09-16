import java.util.Scanner;

public class FishTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenghtInCm = Integer.parseInt(scanner.nextLine());
        int wightInCm = Integer.parseInt(scanner.nextLine());
        int heightInCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeTank = lenghtInCm * wightInCm * heightInCm * 0.001;
        double totalVolumeTank = volumeTank - volumeTank * ( percent * 0.01);

        System.out.printf("%.2f",totalVolumeTank);

    }
}
