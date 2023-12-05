import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String pop = s.nextLine();
        System.out.println("Введите число сдвига");
        int sdvig = s.nextInt();
        System.out.println("Введите направление сдвига(лево/право)");
        String pop1 = s.next();
        System.out.println("ответ ");
        for (int i=0; i<pop.length(); i++) {
            char x = pop.charAt(i);
            if (Character.isLetter(x)) {
                if (pop1.equals("лево")) {
                    x=(char) ((x - 'а' - sdvig) % 26 + 'а');
                } else if (pop1.equals("право")) {
                    x=(char)((x - 'а' + sdvig + 26) % 26 + 'а');
                }
            }
            System.out.print(x);
        }
    }
}