import java.util.HashMap;

public class Main{
    public static void main(String[] args){

    }
    public static int mainn(String num){
        HashMap<Character, Integer> x = new HashMap<>();
        int y = 0;
        x.put('I', 1);
        x.put('V', 5);
        x.put('X', 10);
        x.put('L', 50);
        x.put('C', 100);
        x.put('D', 500);
        x.put('M', 1000);
        for (int i=0; i<num.length(); i++){
            int xx = x.get(num.charAt(i));
            if (i + 1 < num.length() && x.get(num.charAt(i + 1)) > xx)
            {
                y -= xx;
            } else {
                y += xx;
            }
        }
        return y;
    }
}