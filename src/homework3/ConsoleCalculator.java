package homework3;

import java.util.Scanner;

public class ConsoleCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstOperand = getOperand();
        int secondOperand = getOperand();
        MathOperation mathOperation = getOperation();
        System.out.println("Result = " + result(firstOperand, secondOperand, mathOperation));

    }

    static int getOperand() {
        System.out.println("Enter number");
        int num;
        if(scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Something went wrong. Try agan");
            scanner.next();
            num = getOperand();
        }
        return num;
    }

    enum MathOperation {
        SUM,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    static MathOperation getOperation() {

        MathOperation operation;
        System.out.println("Choose operation: for add press 1, for subtract press 2, for multiply press 3, for divide press 4");
        int tempOperation = scanner.nextInt();
        switch (tempOperation) {
            case 1:
                operation = MathOperation.SUM;
                break;

            case 2:
                operation = MathOperation.SUBTRACT;
                break;

            case 3:
                operation = MathOperation.MULTIPLY;
                break;

            case 4:
                operation = MathOperation.DIVIDE;
                break;

            default:
                operation = getOperation();
        }
        return operation;

    }

    static int result(int firstOperand, int secondOperand, MathOperation operation) {
        int result = 0;

        switch (operation) {
            case SUM:
                result = firstOperand + secondOperand;
                break;

            case SUBTRACT:
                result = firstOperand - secondOperand;
                break;

            case MULTIPLY:
                result = firstOperand * secondOperand;
                break;

            case DIVIDE:
                result = firstOperand / secondOperand;
                break;

            default:
                System.out.println("Something went wrong. Try agan");

        }
        return result;
    }
}


