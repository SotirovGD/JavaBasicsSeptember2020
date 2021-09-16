package FirstStepsInCodingLab;

import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Напишете програма, която прочита от конзолата име, фамилия, възраст и град
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
       // int age = Integer.parseInt(scanner.nextLine());
       // String town = scanner.nextLine();

        //System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,lastName,age,town);

        System.out.printf("My town is %s in %s ",firstName,lastName);


    }
}
