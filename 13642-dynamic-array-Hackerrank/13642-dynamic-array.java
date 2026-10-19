import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> arr = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        List<Integer> answers = new ArrayList<Integer>();
        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {

            int type = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);

            int index = (x ^ lastAnswer) % n;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna