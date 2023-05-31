import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double p, s, pl;
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника");
        int x = pop.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        int y = pop.nextInt();
        System.out.println("Введите третью сторону треугольника");
        int z = pop.nextInt();
        p = x+y+z;
        s = p/2;
        pl = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Площадь треугольника "+pl);
    }
}