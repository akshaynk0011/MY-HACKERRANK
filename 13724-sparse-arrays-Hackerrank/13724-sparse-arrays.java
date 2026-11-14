
import java.util.*;

public class Solution {

    public static List<Integer> matchingStrings(
        List<String> stringList,
        List<String> queries
    ) {

        Map<String, Integer> frequency = new HashMap<>();

        // Count frequency of each string
        for (int i = 0; i < stringList.size(); i++) {

            String str = stringList.get(i);

            frequency.put(
                str,
                frequency.getOrDefault(str, 0) + 1
            );
        }

        List<Integer> result = new ArrayList<>();

        // Find frequency of each query
        for (int i = 0; i < queries.size(); i++) {

            String query = queries.get(i);

            result.add(frequency.getOrDefault(query, 0));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringList.add(sc.next());
        }

        int q = sc.nextInt();

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            queries.add(sc.next());
        }

        List<Integer> result = matchingStrings(stringList, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna