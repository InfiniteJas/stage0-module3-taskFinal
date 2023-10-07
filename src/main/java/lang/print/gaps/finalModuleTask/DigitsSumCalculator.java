package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        if (number >= 1000 && number <= 9999) { // Check if the number is a four-digit number
            int digit1 = number % 10;               // Extract the units digit
            int digit2 = (number / 10) % 10;        // Extract the tens digit
            int digit3 = (number / 100) % 10;       // Extract the hundreds digit
            int digit4 = number / 1000;             // Extract the thousands digit

            int sum = digit1 + digit2 + digit3 + digit4; // Calculate the sum of digits

            System.out.println(sum);
        }
    }
}
