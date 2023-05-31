public class Main {
    public static void main (String[] args){
        String x = mainn("123","234");
        System.out.println(x);
    }
    public static String mainn(String n1, String nn1){
        int n = Integer.parseInt(n1);
        int nn = Integer.parseInt(nn1);
        int summ = n+nn;
        return String.valueOf(summ);
    }
}