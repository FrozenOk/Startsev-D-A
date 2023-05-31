import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pop =new Scanner(System.in);
        System.out.println("Введите текст");
        String x =pop.nextLine();
        String[] popa=x.split("\\.\\s*");
        for (int i=0; i<popa.length; i++) {
            String[] simvol=popa[i].split("\\s+");
            for (int j=0; j<simvol.length; j++) {
                char q =simvol[j].charAt(0);
                String m =simvol[j].substring(1);
                simvol[j] =m+q+"ауч";
            }
            popa[i] =String.join(" ",simvol);
        }
        String otv =String.join(" ",popa);
        System.out.println(otv);
    }
}