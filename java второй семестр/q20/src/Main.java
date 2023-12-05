import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите высоту массива");
        int m = pop.nextInt();
        System.out.println("Введите длину массива");
        int n = pop.nextInt();
        int[][] popa = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int vnutr = Math.min(Math.min(i, j), Math.min(m-i-1, n-j-1));
                popa[i][j] = vnutr+1;
            }
        }
        try (FileWriter zapis = new FileWriter("массив.txt")) {
            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    zapis.write(popa[i][j] + " ");
                }
                zapis.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}