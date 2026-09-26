public static int migratoryBirds(List<Integer> arr) {

        int[] frequency = new int[6];

        // Count frequency of each bird type
        for (int i = 0; i < arr.size(); i++) {
            int bird = arr.get(i);
            frequency[bird]++;
        }

        int maxFrequency = 0;
        int answer = 0;

        // Check bird types from smallest to largest
        for (int i = 1; i <= 5; i++) {

            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                answer = i;

public class Solution {

import java.io.*;
import java.util.*;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna