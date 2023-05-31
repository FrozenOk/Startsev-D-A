import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        int[] popa = new int[args.length];
        int sum=0;
        for (int i = 2; i < args.length; i++) {
            popa[i - 2] = Integer.parseInt(args[i]);
        }
        System.out.println("Введите число m");
        int m = pop.nextInt();
        System.out.println("Введите число n");
        int n = pop.nextInt();
        for (int i = m; i <= n; i++){
            for (int j = 0; j < popa.length; j++){
                if (i % popa[j] == 0){
                    sum=sum+i;
                    break;
                }
            }
        }
        System.out.println("Ответ "+sum);
    }
}