import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = pop.nextInt();
        System.out.println("Введите число n");
        int n = pop.nextInt();
        int[] masiv = new int[args.length];
        for (int i = 2; i < args.length; i++) {
            masiv[i - 2] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        boolean kuda;
        for (int i = m; i <= n; i++) {
            kuda = true;
            for (int j = 0; j < masiv.length; j++) {
                if (i % masiv[j] != 0) {
                    kuda = false;
                    break;
                }
            }
            if (kuda) {
                sum += i;
            }
        }
        System.out.println("Ответ "+sum);
    }
}