import java.awt.*;
import java.util.Scanner;

public class Game {





    public Game(UnitFactory factory, int x) {

    }

    public void play(UnitFactory factory ) {

        while (1 > 0) {
            System.out.println("создать бойца (1 пехота, 2 танк, 3 бомбер)");
            Scanner pop = new Scanner(System.in);
            int t = pop.nextInt();
            OrcFactory orc  = new OrcFactory();
            if (t ==2){
                orc.createTank();
            }
            if (t ==1){
                orc.createInfantry();
            }
            if (t ==3){
                orc.createArtillery();
            }
        }
    }
    public void play2(UnitFactory factory ) {

        while (1 > 0) {
            System.out.println("создать бойца (1 пехота, 2 танк, 3 бомбер)");
            Scanner pop = new Scanner(System.in);
            int t = pop.nextInt();
            HumanFactory human  = new HumanFactory();
            if (t ==2){
                human.createTank();
            }
            if (t ==1){
                human.createInfantry();
            }
            if (t ==3){
                human.createArtillery();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Выберите фракцию (1 орки 2 люди)");
        Scanner pop = new Scanner(System.in);
        int x = pop.nextInt();
        if (x == 1) {
            UnitFactory OrcClass = new OrcFactory();
            Game game = new Game(OrcClass, 10);
            game.play(OrcClass);
        }
        if (x == 2) {
            UnitFactory HumanClass = new HumanFactory();
            Game game2 = new Game(HumanClass, 10);
            game2.play2(HumanClass);
        }
        else {
            System.out.println("Такого нет");
        }
    }}
