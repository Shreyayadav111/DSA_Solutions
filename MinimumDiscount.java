import java.util.*;
public class MinimumDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] names = new String[n];
        double[] disc = new double[n];
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().split(",");
            names[i] = p[0];
            disc[i] = Double.parseDouble(p[1]) * Double.parseDouble(p[2]) / 100;
            if (disc[i] < min) min = disc[i];
        }
        for (int i = 0; i < n; i++)
            if (disc[i] == min) System.out.println(names[i]);
    }
}
