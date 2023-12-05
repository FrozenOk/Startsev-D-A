import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Ведите число");
        int x=pop.nextInt();
        int w=0;
        int e=0;
        int n=(int) Math.sqrt(x);
        int y=n+1;
        w=y*y;
        e=n*n;
        w=w-e;
        if (w==n){
            System.out.println("ответ "+n*n+""+w+""+n*n);
        } else {
            System.out.println("низя");
        }
    }
}