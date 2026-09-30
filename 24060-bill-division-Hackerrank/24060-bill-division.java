);

        // n = number of items
        // k = item Anna did not eat
        String[] first = br.readLine().split(" ");

        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);

        // Bill prices
        String[] second = br.readLine().split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bill.add(Integer.parseInt(second[i]));
        }

        // Amount Anna was charged
        int b = Integer.parseInt(br.readLine());

        bonAppetit(bill, k, b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna