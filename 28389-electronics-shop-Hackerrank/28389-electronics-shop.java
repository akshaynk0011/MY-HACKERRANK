// Keyboard prices
        String[] keyboardInput = br.readLine().split(" ");

        List<Integer> keyboards = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            keyboards.add(Integer.parseInt(keyboardInput[i]));
        }

        // USB drive prices
        String[] driveInput = br.readLine().split(" ");

        List<Integer> drives = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            drives.add(Integer.parseInt(driveInput[i]));
        }

        int result = getMoneySpent(keyboards, drives, b);

        System.out.println(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna