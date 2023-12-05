import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner pop = new Scanner(System.in);
        System.out.print("Введите кол-во игроков ");
        int x=pop.nextInt();
        System.out.print("Введите кто ходит первым ");
        int y=pop.nextInt();
        int p=0;
        List<Integer> vse = new ArrayList<>();
        for (int i=1; i<=x; i++){
            vse.add(i);}
        List<Integer> popa = new ArrayList<>();
        int index=y-1;
        while (vse.size()>1){
            p=p+1;
            index = (index + p) % vse.size();
            if (p%3==0){
                popa.add(vse.remove(index));
                index--;}}
        popa.addAll(vse);
        System.out.println("Результат "+popa);}}