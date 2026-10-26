
import java.util.*;

public class Solution {

    public static int viralAdvertising(int n) {
        int shared = 5;
        int totalLikes = 0;

        for (int day = 1; day <= n; day++) {
            int liked = shared / 2;

            totalLikes = totalLikes + liked;

            shared = liked * 3;
        }

        return totalLikes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(viralAdvertising(n));

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna