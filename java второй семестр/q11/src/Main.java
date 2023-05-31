import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите слово");
        String x = pop.nextLine();
        x = x.replaceAll("[у+У+е+Е+ё+Ё+ы+Ы+а+А+о+О+э+Э+я+Я+и+И+ю+Ю]","");
        System.out.println(x);
    }}
