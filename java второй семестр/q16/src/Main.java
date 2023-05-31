import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите текст");
        String x = pop.nextLine();
        int vniz = 0;
        int vverh = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (Character.isUpperCase(c)) {
                vverh++;
            } else if (Character.isLowerCase(c)) {
                vniz++;
            }
        }
        if (vverh > vniz) {
            x = x.toUpperCase();
        } else if (vniz>vverh) {
            x = x.toLowerCase();
        } else {
            x = x.toLowerCase();
        }
        System.out.println(x);
    }
}

