}

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }

        int result = birthdayCakeCandles(candles);

        System.out.println(result);

        sc.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna