package FirstStepsInCodingExercises;

import java.util.Scanner;

public class Probe_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PrStrawberries = Double.parseDouble(scanner.nextLine());
        double QuaBananas = Double.parseDouble(scanner.nextLine());
        double QuaOranges = Double.parseDouble(scanner.nextLine());
        double QuaMalini = Double.parseDouble(scanner.nextLine());
        double QuaStrawberries = Double.parseDouble(scanner.nextLine());
        double PrMalini = PrStrawberries / 2;
        double PrOranges = (PrMalini / 100) * 60;
        double PrBananas = (PrMalini / 100) * 20;
        double AmountMalini = QuaMalini * PrMalini;
        double AmountOranges = QuaOranges * PrOranges;
        double AmountBananas = PrBananas * QuaBananas;
        double AmountStrawberries = QuaStrawberries * PrStrawberries;
        double TotalAmount = AmountMalini + AmountOranges + AmountBananas + AmountStrawberries;
        System.out.printf("%.2f", TotalAmount);
    }
}
