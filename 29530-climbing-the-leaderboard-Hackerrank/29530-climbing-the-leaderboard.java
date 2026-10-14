String[] rankedInput = br.readLine().trim().split("\\s+");
        List<Integer> ranked = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ranked.add(Integer.parseInt(rankedInput[i]));
        }

        int m = Integer.parseInt(br.readLine());

        String[] playerInput = br.readLine().trim().split("\\s+");
        List<Integer> player = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            player.add(Integer.parseInt(playerInput[i]));
        }

        List<Integer> result = climbingLeaderboard(ranked, player);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna