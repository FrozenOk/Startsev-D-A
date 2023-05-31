import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите текст");
        String x = pop.nextLine();
        String[] slova = x.split(" ");
        Set<String> hahaPopalosSlovo = new LinkedHashSet<>(Arrays.asList(slova));
        System.out.println(String.join(" ", hahaPopalosSlovo));
    }
}
