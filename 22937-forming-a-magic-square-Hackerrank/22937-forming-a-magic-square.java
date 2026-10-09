return minCost;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {

            String[] input = br.readLine().trim().split("\\s+");

            for (int j = 0; j < 3; j++) {
                s[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(formingMagicSquare(s));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna