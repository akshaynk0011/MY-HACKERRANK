maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] input = br.readLine().trim().split("\\s+");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(hourglassSum(arr));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna