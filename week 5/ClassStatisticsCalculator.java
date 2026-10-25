
public class Main {
    public static void main(String[] args) {
     System.out.println("==========CLASS STASTISTICS CACLULATOR==========");
        int[] scores = {75, 93, 77, 96, 81, 89, 92, 87};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Total Sum: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
