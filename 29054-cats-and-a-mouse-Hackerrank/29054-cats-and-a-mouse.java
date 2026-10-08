import java.io.*;

public class Solution {

    public static String catAndMouse(int x, int y, int z) {

        int distanceA = Math.abs(x - z);
        int distanceB = Math.abs(y - z);

        if (distanceA < distanceB) {
            return "Cat A";
        } 
        else if (distanceB < distanceA) {
            return "Cat B";
        } 
        else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna