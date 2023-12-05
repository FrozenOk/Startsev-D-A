import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = pop.nextInt();
        System.out.println("Введите второе число");
        int y = pop.nextInt();
        for (int i = 0; i < 5; i++) {
            int num = x + i * y;
            int numnum = num * num;
            System.out.print(numnum + " ");
        }}}