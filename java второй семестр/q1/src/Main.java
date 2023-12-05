import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sum= 0;
        int minus=0;
        int umn=1;
        Scanner pop = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("Введите число ["+i+"]"+"["+j+"]");
                int x = pop.nextInt();
                matrix[i][j] = x;
            }
        }
        System.out.println("ваша матрица");
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("ваша транспортированная матрица");
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[j][i] + "]");
            }
            System.out.println("");
        }

    }}