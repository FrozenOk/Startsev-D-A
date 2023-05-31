public class Main {
    public static int main(int[][] sered){
        int x=0;

        for (int i=0; i< sered.length-1; i++)
        {
            int kon = sered[i][1];
            int sl = sered[i++][0];

            x+=sl-kon-1;
        }
        return x;
    }
}