
public class Main {
    public static void main(String[] args) {

        System.out.println("==========Grade Threshold Checker==========");

        double average = 83;
        int absences = 1;

        boolean isPassed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        if (isPassed) {
            System.out.println("Result: PASS");
            System.out.println("Student performed with excellence and met the requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Student failed to show attentiveness and with excessive absences");
        }

        // The student passes with a grade of 75 or higher and at most 3 absences,
        // or with a grade of 90 or higher even with more absences.
    }
}
