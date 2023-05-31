import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q = 0;
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = pop.nextInt();
        x = x*x;
        q = q+x;
        System.out.println("Введите второе число");
        int xx = pop.nextInt();
        xx = xx*xx;
        q = q+xx;
        System.out.println("Введите третье число");
        int xxx = pop.nextInt();
        xxx = xxx*xxx;
        q = q+xxx;
        System.out.println("Введите четвертое число");
        int xxxx = pop.nextInt();
        xxxx = xxxx*xxxx;
        q = q+xxxx;
        System.out.println("сумма чисел в квадрате"+ q);
    }
}
