import java.util.Scanner;
public class MaximumSemestermark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int s = 1; s <= n; s++) {
            int sub = sc.nextInt(), max = Integer.MIN_VALUE;
            boolean ok = true;
            for (int j = 0; j < sub; j++) {
                int m = sc.nextInt();
                if (m < 0 || m > 100) { System.out.println("Invalid mark"); ok=false; break; }
                if (m > max) max = m;
            }
            if (ok) System.out.println("Max in sem " + s + ": " + max);
        }
    }
}
