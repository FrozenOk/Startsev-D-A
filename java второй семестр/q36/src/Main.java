import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poputki = 20;
        int sekret[] = new int[4];
        sekret[0] = 1;
        sekret[1] = 2;
        sekret[2] = 3;
        sekret[3] = 4;
        while (poputki > 0) {
            System.out.println("У вас "+poputki+" попыток");
            int[] popa = new int[4];
            for (int i = 0; i < 4; i++) {
                System.out.println("Введите "+(i+1)+" число");
                popa[i] = scanner.nextInt();
            }
            int sovpadeniya = 0;
            for (int i = 0; i < 4; i++) {
                if (popa[i] == sekret[i]) {
                    sovpadeniya++;
                }
            }
            if (sovpadeniya == 4) {
                System.out.println("Вы выйграли");
                return;
            } else {
                System.out.println("Вы нашли "+sovpadeniya+" совпадений");
            }
            poputki--;
        }
        System.out.println("Вы проиграли");
    }
}