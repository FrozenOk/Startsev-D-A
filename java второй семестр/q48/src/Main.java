import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> u = new HashSet<>();
        int x = 0;
        int y = 0;
        int z = 0;
        int n = 20;
        while (u.size() < n) {
            y = 2 * x + 1;
            z = 3 * x + 1;
            u.add(x);
            u.add(y);
            u.add(z);
            x++;
        }
        for (int num : u) {
            System.out.print(num + " ");
        }
    }
}