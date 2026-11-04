
import java.util.*;

public class Solution {

    public static int jumpingOnClouds(List<Integer> c, int k) {

        int n = c.size();
        int energy = 100;
        int index = 0;

        do {
            index = (index + k) % n;

            // Every jump costs 1 energy
            energy--;

            // Thundercloud costs 2 additional energy
            if (c.get(index) == 1) {
                energy -= 2;
            }

        } while (index != 0);

        return energy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> c = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }

        System.out.println(jumpingOnClouds(c, k));

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna