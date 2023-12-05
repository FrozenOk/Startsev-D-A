import java.util.HashMap;
import java.util.*;
import java.util.Scanner;
import java.util.Map;
public class Main {
        public static void main(String[] args) {
            Scanner pop = new Scanner(System.in);
            System.out.println("Введите номер");
            String x = pop.nextLine();
            String y = yxyx(x);
            System.out.println("Новый номер "+y);
        }
        public static String yxyx(String x) {
            Map<Character, Character> hash = new HashMap<>();
            hash.put('1', '9');
            hash.put('2', '8');
            hash.put('3', '7');
            hash.put('4', '6');
            hash.put('5', '5');
            hash.put('6', '4');
            hash.put('7', '3');
            hash.put('8', '2');
            hash.put('9', '1');
            hash.put('0', '0');

            StringBuilder zamena = new StringBuilder();
            for (int i=0; i<x.length(); i++) {
                char c=x.charAt(i);
                zamena.append(hash.get(c));
            }
            return zamena.toString();
        }
    }