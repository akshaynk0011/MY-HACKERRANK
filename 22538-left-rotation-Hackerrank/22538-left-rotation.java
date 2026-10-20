int n = Integer.parseInt(firstLine[0]);
        int d = Integer.parseInt(firstLine[1]);

        String[] input = br.readLine().trim().split("\\s+");
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(input[i]));
        }

        List<Integer> result = rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna