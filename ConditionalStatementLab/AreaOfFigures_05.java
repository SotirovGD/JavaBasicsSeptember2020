package ConditionalStatementLab;

import java.util.Scanner;

public class AreaOfFigures_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // създаваме си променливите за 4етене
        // фигурите са 4 - square ,rectangle,circle,triangle

        String shape = scanner.nextLine();
        double sideA = Double.parseDouble(scanner.nextLine());
        double area = 0;

        if (shape.equals ("square")){
            area = sideA * sideA;
        }
        if (shape.equals("rectangle")){
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        }
        if (shape.equals("circle")){
            area = Math.PI * ( sideA * sideA);
        }
        if(shape.equals("triangle")){
            double sideB = Double.parseDouble(scanner.nextLine());
            area = ( sideA * sideB ) / 2;
        }
        System.out.printf("%.3f",area);



        
    }
}
