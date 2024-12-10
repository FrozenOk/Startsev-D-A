public class Points {
    private static int y = 10;
    public int points(int x) {
        y = y - x;
        if (y<0){
            y = 0;
        }
        System.out.println("очков осталось " + y);
        return y;
    }
}