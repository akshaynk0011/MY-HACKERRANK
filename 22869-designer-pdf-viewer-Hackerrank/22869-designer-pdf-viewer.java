}

        return maxHeight * word.length();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String[] input = br.readLine().trim().split("\\s+");

        int[] h = new int[26];

        for (int i = 0; i < 26; i++) {
            h[i] = Integer.parseInt(input[i]);
        }

        String word = br.readLine().trim();

        System.out.println(designerPdfViewer(h, word));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna