public class PythagoreanTriplets {
    public static void main(String[] args) {
        int limit = 20;
        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                int sum = a*a + b*b;
                int c = (int) Math.sqrt(sum);
                if (c * c == sum && c < limit)
                    System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
 
