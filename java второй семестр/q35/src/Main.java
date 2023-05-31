import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        String text = new String();
        System.out.println("Введите текст");
        String x = pop.nextLine();
        text = x;

        Map<Character, Integer> popa = shifr(text);
        popa.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    public static Map<Character, Integer> shifr(String text) {
        Map<Character, Integer> popa = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                popa.put(c, popa.getOrDefault(c, 0) + 1);
            }
        }
        return popa;
    }
}