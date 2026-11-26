
import java.util.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);

            // Failing grades are not rounded
            if (grade < 38) {
                result.add(grade);
            } else {

                int nextMultiple = ((grade / 5) + 1) * 5;

                // Round if difference is less than 3
                if (nextMultiple - grade < 3) {
                    grade = nextMultiple;
                }

                result.add(grade);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> grades = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna