import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
    int x = getMain(68);//просто для теста что число возвращается
        System.out.println(x);
    }
    public static int getMain(int num) {
        int[] mas=Integer.toString(num).chars().map(c -> c - '0').toArray();
        int i = mas.length - 2;
        while (i>=0 && mas[i] >= mas[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = mas.length - 1;
        while (mas[j] <= mas[i]) {
            j--;
        }
        int m=mas[i];
        mas[i]=mas[j];
        mas[j]=m;
        Arrays.sort(mas,i+1, mas.length);
        int p=Integer.parseInt(Arrays.toString(mas)
                .replaceAll("[\\[\\]\\,\\s]", ""));
        return (p>num) ? p:-1;
    }
}