import java.io.*;

public class Solution {

    public static String dayOfProgrammer(int year) {

        // Special transition year
        if (year == 1918) {
            return "26.09.1918";
        }

        boolean leapYear;

        // Julian Calendar
        if (year < 1918) {
            leapYear = (year % 4 == 0);
        }
        // Gregorian Calendar
        else {
            leapYear = (year % 400 == 0)
                    || (year % 4 == 0 && year % 100 != 0);
        }

        // 256th day

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna