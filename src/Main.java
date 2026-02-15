//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int valueOne = 150;
        int valueTwo = 280;
        int maxValue = valueOne > valueTwo ? valueOne : valueTwo;

        // System.out.println(maxValue);

        if (valueOne > valueTwo) {
            System.out.println("That is correct");
        }
        else {
            System.out.println("That is false");
        }

    }
}