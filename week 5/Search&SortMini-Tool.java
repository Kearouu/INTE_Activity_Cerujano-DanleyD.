
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      
        int[] scores = {75, 93, 77, 96, 81, 92, 87};

        int target = 90;
        boolean found = false;

        System.out.println("=== SEARCH & SORT MINI-TOOL ===");

        // Display the original array
        System.out.println("Original Scores: " + Arrays.toString(scores));

        // Linear Search
        System.out.println("\n=== LINEAR SEARCH ===");

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                System.out.println("Target Score: " + target);
                System.out.println("Score Found at Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target Score " + target + " was not found.");
        }

        // Copy the original array before sorting
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sorting a copy preserves the original order of the scores.
        // This matters if we still need the original array for searching
        // or for comparing the scores in their original order.
        Arrays.sort(sortedScores);

        // Display both arrays
        System.out.println("\n=== SORTING RESULTS ===");
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
    }
}
