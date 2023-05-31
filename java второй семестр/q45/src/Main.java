public class Main {
    public static void main(String[] args){
        String y = mainn(567);
        System.out.println(y);
    }
    private static final String[] m = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] mm = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] mmm = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] mmmm = {"", "M", "MM", "MMM"};
    public static String mainn(int num) {
        StringBuilder x = new StringBuilder();
        x.append(mmmm[num /1000]);
        x.append(mmm[(num% 1000)/100]);
        x.append(mm[(num % 100) / 10]);
        x.append(m[num% 10]);
        return x.toString();
    }
}