import java.util.Comparator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String[] ves = input.split(" ");
        Arrays.sort(ves, Comparator.comparingInt(Main::sumsum).reversed());
        System.out.println(String.join(" ", ves));
    }
    private static int sumsum(String n) {
        int sum=0;
        for (int i=0; i<n.length(); i++) {
            sum+=Character.getNumericValue(n.charAt(i));
        }
        return sum;
    }
}