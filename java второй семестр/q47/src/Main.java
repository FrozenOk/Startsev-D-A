import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(array[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(array[i][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(array[rowEnd][i]);
                }
                rowEnd--;
            }
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(array[i][colBegin]);
                }
                colBegin++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> sorted = snail(array);
        System.out.println(sorted);
    }
}