Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        // Read Alice's ratings
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        // Read Bob's ratings
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);

        // Print result
        System.out.println(result.get(0) + " " + result.get(1));

        sc.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna