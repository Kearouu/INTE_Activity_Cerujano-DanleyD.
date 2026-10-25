
public class Main {
    public static void main(String[] args) {
        System.out.println("========== Precedence Puzzle Solver ==========");

        // PREDICTED result: 7
        // I think the answer is 7 because multiplication happens before addition.
        int result1 = (5 > 3 ? 1 : 0) + 2 * 3;
        System.out.println("Expression 1 Actual Result: " + result1);

        // PREDICTED result: 1
        // I think the answer is 1 because both conditions are true.
        int result2 = ((5 < 3 ? 1 : 0) == 0 && 2 > 1) ? 1 : 0;
        System.out.println("Expression 2 Actual Result: " + result2);

        // PREDICTED result: 9
        // I think the answer is 9 because a-- uses 5 first, then ++a increases it back to 5.
        int a = 5;
        int result3 = a-- - 1 + ++a;
        System.out.println("Expression 3 Actual Result: " + result3);
    }
}
