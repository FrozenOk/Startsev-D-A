import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("Введите первое число");
        int n = scanner.nextInt();
        System.out.println("Введите второе число");
        int x = scanner.nextInt();
        System.out.println("Введите третье число");
        int y = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%x==0 || i% y==0) {
                sum += i;
            }
        }
        System.out.println("Сумма "+sum);
    }
}