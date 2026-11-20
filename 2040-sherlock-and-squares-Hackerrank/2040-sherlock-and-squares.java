
import java.util.*;

public class Solution {

    public static int squares(int a, int b) {

        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));

        return Math.max(0, end - start + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(squares(a, b));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna