
import java.util.*;

public class Solution {

    public static String appendAndDelete(String s, String t, int k) {

        int common = 0;

        // Find common prefix
        while (common < s.length() &&
               common < t.length() &&
               s.charAt(common) == t.charAt(common)) {

            common++;
        }

        int delete = s.length() - common;
        int append = t.length() - common;

        int minimumOperations = delete + append;

        // Case 1: Exact minimum operations
        if (minimumOperations == k) {
            return "Yes";
        }

        // Case 2: Extra operations can be used
        if (minimumOperations < k) {

            // Extra operations must be even
            if ((k - minimumOperations) % 2 == 0) {
                return "Yes";
            }

            // Can delete entire string and continue deleting
            if (k >= s.length() + t.length()) {
                return "Yes";
            }
        }

        return "No";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();

        System.out.println(appendAndDelete(s, t, k));

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna