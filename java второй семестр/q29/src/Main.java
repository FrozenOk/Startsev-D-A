import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите число");
        int x = pop.nextInt();
        System.out.println("Введите число начала ряда");
        int ryad = pop.nextInt();
        int sum=0;
        int popa=1;
        while (true) {
            int mmm = ooo(x, popa);
            if (mmm==0) {
                break;
            }
            sum+=Math.pow(ryad, popa)*mmm;
            popa++;
        }
        for (int i=2; i<=Math.pow(2, 6); i++) {
            if (sum%i==0 && popa3(ryad, i)) {
                System.out.println("Возможно");
                return;
            }
        }
        System.out.println("Невозможно");
    }
    private static int ooo(int x, int popa) {
        int popa1=(int) Math.pow(10, popa-1);
        return x/popa1%10;
    }
    private static boolean popa3(int x, int popa2) {
        while (x%popa2==0) {
            x/=popa2;
        }
        return x==1;
    }
}