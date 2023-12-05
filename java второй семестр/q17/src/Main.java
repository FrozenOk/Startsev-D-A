import java.util.Scanner;
import java.util.*;
public class Main {
    public static boolean main(String str){
        Stack<Character> hash = new Stack<Character>();
        for (int i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            if (c=='(')
            {
                hash.push(c);
            } else if (c==')')
            {
                if (hash.isEmpty())
                {
                    return false;
                }
                char q = hash.pop();
                if ((c==')' && q!='(') || (c==']' && q!='[') || (c=='}' && q!='{'))
                {
                    return false;
                }
            }
        }
        return hash.isEmpty();
    }
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Введите скобочки");
        String x = pop.nextLine();
        if (main(x)==true){
            System.out.println("Скобчки закрытые");
        }
        else {
            System.out.println("Скобочки открытые");
        }
    }
}
