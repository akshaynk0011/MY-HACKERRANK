else {
            leapYear = (year % 400 == 0)
                    || (year % 4 == 0 && year % 100 != 0);
        }

        // 256th day
        if (leapYear) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int year = Integer.parseInt(br.readLine());

        System.out.println(dayOfProgrammer(year));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna