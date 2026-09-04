String[] arrTemp = scanner.nextLine().trim().split(" ");
        List<Integer> ar = new ArrayList<>();
        for (String s : arrTemp) {
            ar.add(Integer.parseInt(s));
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.
        getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna