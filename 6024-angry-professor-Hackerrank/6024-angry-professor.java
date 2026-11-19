
import java.util.*;

public class Solution {

    public static String angryProfessor(int k, List<Integer> a) {

        int count = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) <= 0) {
                count++;
            }
        }

        if (count < k) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> a = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }

            System.out.println(angryProfessor(k, a));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna