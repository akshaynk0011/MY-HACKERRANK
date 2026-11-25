
import java.util.*;

public class Solution {

    public static int nonDivisibleSubset(int k, List<Integer> s) {

        int[] freq = new int[k];

        // Count frequency of each remainder
        for (int i = 0; i < s.size(); i++) {
            int remainder = s.get(i) % k;
            freq[remainder]++;
        }

        int count = 0;

        // At most one element with remainder 0
        if (freq[0] > 0) {
            count++;
        }

        // Select maximum frequency from complementary pairs
        for (int i = 1; i <= k / 2; i++) {

            if (i == k - i) {
                // If k is even, select only one element
                if (freq[i] > 0) {
                    count++;
                }
            } else {
                count += Math.max(freq[i], freq[k - i]);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> s = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        System.out.println(nonDivisibleSubset(k, s));

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna