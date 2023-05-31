import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        int da[] = new int[3];
        for (int i=0; i<da.length; i++){
            System.out.println("Введите "+ i +" число массива");
            int x = pop.nextInt();
            da[i] = x;
        }
        boolean vseharosh = true;
        while (vseharosh){
            System.out.println("Введите число или 0 для завершения");
            int x = pop.nextInt();
            int min = 9;
            int nomer = 0;
            if (x > 0){
                for (int i=0; i<da.length; i++){
                    if (da[i] < min){
                        min = da[i];
                        nomer = i;
                    }

                }
                da[nomer] = x;
                System.out.println(da[0]+" " +da[1]+" "+da[2]);
            }
            else{
                vseharosh = false;
            }
        }
        System.out.println(da[0]+" " +da[1]+" "+da[2]);
    }
}
