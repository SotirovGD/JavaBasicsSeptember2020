package ConditionalStatementLab;

import java.util.Scanner;

public class probe_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startHours = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());
        int startTimeMin = startHours * 60;
        int startTimeRestMin = startMinutes % 60;
        int totalTime = startTimeMin + startTimeRestMin;
        int totalTimeAfterMin = totalTime + 15;
        int totalTimeInMin = totalTimeAfterMin * 60;
        





    }
}
