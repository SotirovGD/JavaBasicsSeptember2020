import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //0. цената на ягодите е 48/кг зададена от конзолата
        //1. цената на малините е с 50% по-ниска от тази на ягодите;
        //2. цената на портокалите е с 40% по-ниска от цената на малините;
        //3. цената на бананите е с 80% по-ниска от цената на малините.

        // Цена на ягодите в лева
        // Количеството бананите в килограми
        // Количеството портокалите в килограми
        // Количеството малините в килограми - RAS
        // Количеството ягодите в килограми

        double strPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double rasKg = Double.parseDouble(scanner.nextLine());
        double strKg = Double.parseDouble(scanner.nextLine());

        double rasPrice = strPrice / 2;
        double orangesPrice = rasPrice - rasPrice * 0.40;
        double bananasPrice = rasPrice - rasPrice * 0.80;

        double orangesPerKg = orangesKg * orangesPrice;
        double bananasPerKg = bananaKg * bananasPrice;
        double rasPerKg = rasKg * rasPrice;
        double strawberryPerKg = strKg * strPrice;

        double totalSum = orangesPerKg + bananasPerKg + strawberryPerKg + rasPerKg;
        System.out.printf("%.2f",totalSum);
















    }
}
