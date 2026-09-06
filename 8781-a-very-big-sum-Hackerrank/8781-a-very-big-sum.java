}

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(sc.nextLong());
        }

        long result = aVeryBigSum(ar);

        System.out.println(result);

        sc.close();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna