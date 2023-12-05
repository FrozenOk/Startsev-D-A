import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String x = pop.nextLine();
        System.out.println("Введите вторую строку");
        String y = pop.nextLine();
        String x2 = x;
        int q=0;
        while (q==0){
            if (x2.equals(y)){
                System.out.println("вторая строка это окончание первой");
                q =1;
            }
            else {
                x2 = x2.substring(1);
            }
        }
    }
}
