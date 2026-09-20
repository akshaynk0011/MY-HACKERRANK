int n = Integer.parseInt(third[1]);

        // Apple distances
        String[] appleInput = br.readLine().split(" ");
        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            apples.add(Integer.parseInt(appleInput[i]));
        }

        // Orange distances
        String[] orangeInput = br.readLine().split(" ");
        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            oranges.add(Integer.parseInt(orangeInput[i]));
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna