return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(grades);

        }

            }

            result.add(grade);
            if (nextMultiple - grade < 3) {
                grade = nextMultiple;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna