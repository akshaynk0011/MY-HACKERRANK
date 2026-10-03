valleys++;
                }
            } else {
                level--;
            }
        }

        return valleys;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int steps = Integer.parseInt(br.readLine());
        String path = br.readLine();

        int result = countingValleys(steps, path);

        System.out.println(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna