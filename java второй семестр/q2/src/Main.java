import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int skolko = 0;
        boolean danet = true;
        int[] rabotyagi = new int[10];
        boolean[] bool = new boolean[10];
        Scanner gaysex = new Scanner(System.in);
        for (int i=0;i<rabotyagi.length;i++){
            System.out.println(i+"дурачек");
            int x = gaysex.nextInt();
            rabotyagi[i] = x;
            skolko = skolko+x;
            if (x == 1){
                bool[i] = true;

            }
            if(x==0){
                bool[i]=false;
            }
        }
        System.out.println("всего работяг "+ skolko);
        for (int i=0;i<rabotyagi.length;i++){
            System.out.print("["+rabotyagi[i]+"]");
        }
        System.out.println("или же");
        for (int i=0;i<rabotyagi.length;i++){
            System.out.print("["+bool[i]+"]");


        }
    }}
