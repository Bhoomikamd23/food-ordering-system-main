package util;
import java.util.Scanner;
/* Reads a number and repeats the question if the input is not numeric. */
public class InputHelper {
    public static int readNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine().trim();

if (input.isEmpty()) {
    System.out.println("Input cannot be empty.");
    continue;
}

return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
    /**
 * Reads a positive integer from the user.
 * Repeats until the user enters a number greater than zero.
 */
public static int readPositiveNumber(Scanner scanner, String message) {
    while (true) {
        int number = readNumber(scanner, message);

        if (number > 0) {
            return number;
        }

        System.out.println("Enter a number greater than zero.");
    }
}
}
