import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean validOperation = true;

        System.out.println("Hi user, welcome to the calculator");
        System.out.println("Please, write first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please, write second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("Now please choose action (1-4):");
        System.out.println("1. Add | 2. Subtract | 3. Multiply | 4. Divide");
        int choice = scanner.nextInt();

        if (choice == 1) {
            result = firstNumber + secondNumber;
        } else if (choice == 2) {
            result = firstNumber - secondNumber;
        } else if (choice == 3) {
            result = firstNumber * secondNumber;
        } else if (choice == 4) {

            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid menu choice.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}