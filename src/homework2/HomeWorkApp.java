package homework2;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareNumbersBetweenRange(2, 4));
        checkNumberSign(-1);
        System.out.println(defineNumberSign(-500));
        printStringNTimes("Hello", 7);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -20;
        int b = 10;
        int sumAB = a + b;
        if (sumAB >= 0){
            System.out.println("Sum is positive");
        }else{
            System.out.println("Sum is negative");
        }

    }

    public static void printColor() {
        int value = -10;
        if (value <= 0){
            System.out.println("RED");
        }else if (value > 0 && value <= 100){
            System.out.println("YELLOW");
        }else if (value > 100){
            System.out.println("GREEN");
        }else{
            System.out.println("Something went wrong");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 7;

        if (a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }

    public static boolean compareNumbersBetweenRange(int a, int b) {
        int sumAB = a + b;
        return sumAB >= 10 && sumAB <= 20;
    }

    public static void checkNumberSign(int a) {
        if (a >= 0){
            System.out.println("You enter positive number");
        }else{
            System.out.println("You enter negative number");
        }
    }

    public static boolean defineNumberSign(int a) {
        return a < 0;
    }

    public static void printStringNTimes(String customString, int n) {
        for (int i = 0; i < n; i++){
            System.out.println(customString);
        }
    }


}
