import java.util.ArrayList;
import java.util.List;
public class Main {


    public static String vivod(int[] num){
        List<String> znachen = new ArrayList<>();
        int x = num[0];
        int y = x;
        for (int i=1; i<num.length; i++)
        {
            if (num[i] == y+1)
            {
                y=y+1;
            } else
            {
                znachen.add(format(x, y));
                x=y=num[i];
            }
        }
        znachen.add(format(x, y));


        return String.join(",", znachen);
    }
    private static String format(int x, int y)
    {
        if (x==y)
        {
            return Integer.toString(x);
        } else
        {
            return x+"-"+y;
        }
    }
}