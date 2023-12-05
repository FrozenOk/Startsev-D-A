import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите число больше 10");
        Scanner pop = new Scanner(System.in);
        int i = pop.nextInt();
        long fib = FibonachiLoh(i);
        int znachenie1 = Maximum(fib);
        System.out.printf("f(%d) = %d [(%d, %d)]%n", i, fib, znachenie1, maximum2(fib, znachenie1));
    }
    public static long FibonachiLoh(int i){
        double kv = Math.sqrt(5);
        double phi = (1 + kv) / 2;
        double psi = (1 - kv) / 2;
        return Math.round((Math.pow(phi, i) - Math.pow(psi, i)) / kv);
    }
    public static int Maximum(long num){
        int[] mmm = new int[10];
        while (num > 0){
            mmm[(int)(num % 10)]++;
            num /= 10;
        }
        int maxi=Arrays.stream(mmm).max().getAsInt();
        for (int i = 9; i >= 0; i--){
            if (mmm[i]==maxi){
                return i;
            }
        }
        return -1;
    }
    public static int maximum2(long num, int znachenie) {
        int q=0;
        while (num>0){
            if (num%10==znachenie){
                q++;
            }
            num/=10;
        }
        return q;
    }
}