package homework1;

import java.util.Scanner;

public class Main {
    static String userName;
    static String userSurname;
    static double depAmount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        userName = scanner.nextLine();
        System.out.println("Enter your Last Name");
        userSurname = scanner.nextLine();
        System.out.println("Enter deposit amount");
        depAmount = scanner.nextDouble();

        System.out.println("Report for " + userName + " " + userSurname);
        System.out.println("In a year you will earn ");
        System.out.println("In 5 years you will earn ");
        System.out.println("In 10 years you will earn ");





    }
    public double calculateDepositInterestInYear() {
        return depAmount * 0.05;
    }
}
