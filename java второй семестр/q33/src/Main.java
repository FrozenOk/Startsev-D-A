import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите колличество палочек");
        long x = pop.nextLong();
        long x1 = pohel(x, true);
        System.out.println("у тани будет "+x1+" палочек");
    }
    private static long pohel(long palka, boolean t){
        if (palka==1){
            return t?0:1;
        }
        if (palka%2==0){
            if(t){
                return pohel(palka/2,!t);
            } else{
                if (palka==2){
                    return 1;
                } else{
                    return Math.max(pohel(palka-1,!t),pohel(palka/2,!t));
                }
            }
        } else{
            return pohel(palka-1,!t);
        }
    }
}