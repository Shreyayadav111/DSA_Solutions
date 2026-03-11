public class StringRotation {
    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean result = (s.length() == goal.length()) && (s+s).contains(goal);

        System.out.println(result);
    }
}
