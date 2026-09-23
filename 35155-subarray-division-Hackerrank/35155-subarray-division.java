BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(input[i]));
        }

        String[] third = br.readLine().split(" ");

        int d = Integer.parseInt(third[0]);
        int m = Integer.parseInt(third[1]);

        int result = birthday(s, d, m);

        System.out.println(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna