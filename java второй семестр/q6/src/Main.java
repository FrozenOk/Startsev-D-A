import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите число");
        int x = pop.nextInt();
        if (x%2 == 0){
            System.out.println("четна");
        }
        else{
            System.out.println("не четна");
        }
    }
}
