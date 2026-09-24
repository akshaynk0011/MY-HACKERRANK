BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // n and k
        String[] first = br.readLine().split(" ");

        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);

        // Array
        String[] second = br.readLine().split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(Integer.parseInt(second[i]));
        }

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna