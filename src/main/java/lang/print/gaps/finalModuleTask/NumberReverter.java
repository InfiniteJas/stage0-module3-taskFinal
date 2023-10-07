package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        if (number >= 100 && number <= 999) { // Check if the number is 3-digit
            int digit1 = number % 10;            // Extract the units digit
            int digit2 = (number / 10) % 10;     // Extract the tens digit
            int digit3 = number / 100;           // Extract the hundreds digit

            int reversedNumber = digit1 * 100 + digit2 * 10 + digit3; // Reconstruct the number

            System.out.println(reversedNumber);
        }
    }
}
