
import java.util.*;

public class Solution {

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        Collections.sort(arr);

        List<Integer> result = new ArrayList<Integer>();

        int n = arr.size();

        for (int i = 0; i < n; i++) {

            // Count sticks before each new cut
            if (i == 0 || !arr.get(i).equals(arr.get(i - 1))) {
                result.add(n - i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = cutTheSticks(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna