import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите число");
        Integer n = pop.nextInt();
            int x = func(n);
            System.out.println("Ваша функция равняется "+x);
        }
    public static int func(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else if (n%2==0){
            return func(n/2);
        } else {
            return func(n/2) + func(n/2+1);
        }
    }
}
