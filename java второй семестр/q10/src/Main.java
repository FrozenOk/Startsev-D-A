import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите имя");
        String x = pop.nextLine();
        x = x.toLowerCase();
        x = x.substring(0, 1).toUpperCase() + x.substring(1);
        System.out.println("Привет, " + x);
    }}