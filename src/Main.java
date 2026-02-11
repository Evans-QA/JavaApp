//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Demonstrate that variables can be assigned the value of other variables
        int number1 = 10;
        int number2 = number1; // number2 now holds the value '10'

        System.out.println(number2);

        // Update number2 to show that it changes independently of number1
        number2 = -5;

        // Verify the sum changes when one variable is updated
        System.out.println(number1 + number2);

        // Re-assign number1 to a new value
        number1 = 55;

        System.out.println(number1 + number2);
    }
}