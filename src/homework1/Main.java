package homework1;

import java.util.Scanner;

public class Main {
    static String userName;
    static String userSurname;
    static double depAmount;

    public static void main(String[] args) {

        doInputsInfo();
        showInfo();
    }

    public static void doInputsInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        userName = scanner.nextLine();
        System.out.println("Enter your Last Name");
        userSurname = scanner.nextLine();
        System.out.println("Enter deposit amount");
        depAmount = scanner.nextDouble();
    }

    public static double calcDepositInterestIn1Year(double depositAmount) {
        return depositAmount * 0.05;
    }

    public static double calcDepositInterestIn5Years(double depositAmount){
        return depositAmount * 5;
    }

    public static double calcDepositInterestIn10Years(double depositAmount){
        return depositAmount * 10;
    }

    public static void showInfo(){
        System.out.println("Report for " + userName + " " + userSurname);
        System.out.println("In a year you will earn " + calcDepositInterestIn1Year(depAmount) + " UAH");
        System.out.println("In a year you will earn " + calcDepositInterestIn5Years(depAmount) + " UAH");
        System.out.println("In a year you will earn " + calcDepositInterestIn10Years(depAmount) + " UAH");
    }
}
