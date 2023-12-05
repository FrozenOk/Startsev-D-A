import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите начало ряда");
        int x = pop.nextInt();
        System.out.println("Введите шаг");
        int y = pop.nextInt();
        System.out.println("Введите кол-во шагов");
        int z = pop.nextInt();
        System.out.print(x+" ");
        for (int i=0; i<z-1; i++ ){
            x = x+y;
            System.out.print(x+" ");
        }
    }}
