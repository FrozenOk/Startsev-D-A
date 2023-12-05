import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите кол-во палочек");
        long x = pop.nextLong();

        boolean sanya = true;
        while (x>1){
            if (x%2==0){
                if (sanya){
                    x=x/2;
                } else{
                    x=x-1;
                }
            } else{
                x=x-1;
            }
            sanya=!sanya;
        }
        if (sanya) {
            System.out.println("Саня победил");
        } else {
            System.out.println("Таня победила");
        }
    }
}