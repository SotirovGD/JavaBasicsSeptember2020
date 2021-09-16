package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  1. Името на архитекта - текст
        //  2. Брой на проектите - цяло число в интервала
        // един проект се изготвя за 3 4аса
        // "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hoursPerProject = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,hoursPerProject,projects );

    }
}
