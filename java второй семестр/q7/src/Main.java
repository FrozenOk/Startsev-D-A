import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q =0;
        int d = 0;
        int s =0;
        int a =1;
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите число");
        int x = pop.nextInt();
        while (q == 0){
            d++;
            s = d*d;
            if (s > x){
                System.out.println("Ближайшее число в квадрате " + a );
                q = 1;
            }
            a = d;
        }
    }
}
