
import java.util.*;

public class Solution {

    public static int findDigits(int n) {

        int num = n;
        int count = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit != 0 && n % digit == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(findDigits(n));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna