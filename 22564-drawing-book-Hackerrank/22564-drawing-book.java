public class Solution {

    public static int pageCount(int n, int p) {

        int front = p / 2;
        int back = n / 2 - p / 2;

        return Math.min(front, back);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int result = pageCount(n, p);

        System.out.println(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna