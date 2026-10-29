
import java.util.*;

public class Solution {

    public static int saveThePrisoner(int n, int m, int s) {
        return (int) (((long) s + m - 2) % n) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            System.out.println(saveThePrisoner(n, m, s));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna