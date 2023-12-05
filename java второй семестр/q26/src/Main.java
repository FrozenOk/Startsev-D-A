import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите строку");
        String x = pop.nextLine();
        int PalindromDlin=0;
        for (int i=0; i < x.length(); i++) {
            String palindrom = jpalind(x,i,i);
            if (palindrom.length() > PalindromDlin){
                PalindromDlin = palindrom.length();
            }
            palindrom = jpalind(x,i,i+1);
            if (palindrom.length() > PalindromDlin){
                PalindromDlin = palindrom.length();
            }
        }
        System.out.println("Длина палиндрома "+PalindromDlin);
    }
    private static String jpalind(String s,int l,int r){
        while (l >= 0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            r++;
            l--;
        }
        return s.substring(l+1, r);
    }
}