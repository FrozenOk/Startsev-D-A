import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        int[] matrix = new int[10];
        for (int i=0;i<matrix.length;i++) {
            System.out.println("Введите " + i + " число массива");
            int n = pop.nextInt();
            matrix[i] = n;
        }
        System.out.println("Ваш массив " + Arrays.toString(matrix));
        int max = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] > matrix[max]) {
                max = i;
            }
        }
        System.out.println("Большее число " + matrix[max]);
        int[] leftMatrix = Arrays.copyOfRange(matrix, 0, max);
        System.out.println("Новый массив 1) " + Arrays.toString(leftMatrix));
        int[] rightMatrix = Arrays.copyOfRange(matrix, max+1, matrix.length);
        System.out.println("Новый массив 2)  " + Arrays.toString(rightMatrix));
    }
}