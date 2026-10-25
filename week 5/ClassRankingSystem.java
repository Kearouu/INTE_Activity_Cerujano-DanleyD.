
class Student {
    String name;
    int[] quizzes;
    double average;

    // Constructor
    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;

        int total = 0;

        for (int score : quizzes) {
            total += score;
        }

        average = (double) total / quizzes.length;
    }
}

public class Main {
    public static void main(String[] args) {

        // Raw quiz data: 4 quiz scores for each student
        String[] names = {
            "Dan", "Leigh", "Kearou", "Ling", "Joyce"
        };

        int[][] quizData = {
            {91, 86, 88, 90},
            {88, 83, 95, 79},
            {91, 92, 95, 100},
            {90, 87, 96, 93},
            {75, 80, 85, 80}
        };

        // Build an array of Student objects
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Custom sorting: Bubble Sort by average, highest first
        // No Arrays.sort() is used.
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Print the leaderboard with competition ranking
        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s %-10s%n",
                "Rank", "Name", "Average", "Quizzes");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            // Students with equal averages receive the same rank
            if (i > 0 &&
                Double.compare(students[i].average,
                               students[i - 1].average) != 0) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f ",
                    rank, students[i].name, students[i].average);

            for (int score : students[i].quizzes) {
                System.out.print(score + " ");
            }

            System.out.println();
        }

        // Custom linear search by student name
        String targetName = "Dan";
        int foundRank = linearSearch(students, targetName);

        System.out.println("\n========== STUDENT SEARCH ==========");

        if (foundRank != -1) {
            System.out.println(targetName + " is ranked #" + foundRank);
        } else {
            System.out.println(targetName + " was not found.");
        }
    }

    // Linear search returns the student's rank, or -1 if not found
    public static int linearSearch(Student[] students, String target) {

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                Double.compare(students[i].average,
                               students[i - 1].average) != 0) {
                rank = i + 1;
            }

            if (students[i].name.equalsIgnoreCase(target)) {
                return rank;
            }
        }

        return -1;
    }
}
