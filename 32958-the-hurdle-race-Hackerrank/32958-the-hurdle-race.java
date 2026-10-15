}

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String[] first = br.readLine().trim().split("\\s+");

        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);

        String[] input = br.readLine().trim().split("\\s+");

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(input[i]);
        }

        System.out.println(hurdleRace(k, height));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna