import java.util.HashMap;
import java.util.Map;

public class converter {
    // Create a map to associate Roman numeral characters with their integer values
    private static Map<Character, Integer> map;
    static {
        map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
    }

    // Method to convert a Roman numeral string to an integer
    public int romanToInt(String s) {
        int convertedNumber = 0; // Initialize the result integer

        // KLook and go through all the integer values
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i)); // Get the integer value of the current character

            // Check if there is a next character
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            // Compare the current and next character values to determine addition or subtraction
            if (currentNumber >= next) {
                // If the current value is greater than or equal to the next, add it to the result
                convertedNumber += currentNumber;
            } else {
                // If the current value is less than the next, subtract it from the result
                convertedNumber -= currentNumber;
            }
        }

        // Return the final integer value representing the Roman numeral
        return convertedNumber;
    }
}