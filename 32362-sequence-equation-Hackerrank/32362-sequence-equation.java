
import java.util.*;

public class Solution {

    public static List<Integer> permutationEquation(List<Integer> p) {

        int n = p.size();

        int[] position = new int[n + 1];

        // Store the position of every value
        for (int i = 0; i < n; i++) {
            position[p.get(i)] = i + 1;
        }

        List<Integer> result = new ArrayList<>();

        // Find p(p(x)) for every x
        for (int x = 1; x <= n; x++) {

            int firstPosition = position[x];

            int secondPosition = position[firstPosition];

            result.add(secondPosition);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        List<Integer> result = permutationEquation(p);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna