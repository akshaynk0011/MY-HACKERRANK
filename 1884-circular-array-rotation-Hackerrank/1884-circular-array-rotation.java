
import java.util.*;

public class Solution {

    public static List<Integer> circularArrayRotation(
            List<Integer> a, int k, List<Integer> queries) {

        int n = a.size();
        k = k % n;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {

            int index = queries.get(i);

            int originalIndex = (index - k + n) % n;

            result.add(a.get(originalIndex));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            queries.add(sc.nextInt());
        }

        List<Integer> result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna