public class HumanFactory implements UnitFactory {
    Points po = new Points();


    @Override

    public Infantry createInfantry() {
        int InfantryCost = 1;
        int a = po.points(InfantryCost);
        System.out.println(a);
        HumanInfantry infantry = new HumanInfantry();
        if (a>=InfantryCost){
            infantry.attack();
            return new HumanInfantry();
        }
        else {
            System.out.println("недостаточно мани");

            return null;


        }
    }

    @Override
    public Tank createTank() {
        int TankCost = 2;
        int a = po.points(TankCost);
        System.out.println(a);
        HumanTank tank = new HumanTank();
        if (a>=TankCost){
            tank.fire();
            return new HumanTank();
        }
        else {

            System.out.println("недостаточно мани");

            return null;
        }
    }

    @Override
    public Artillery createArtillery() {

        int artilleryCost = 3;
        int a = po.points(artilleryCost);
        System.out.println(a);
        HumanArtillery artillery = new HumanArtillery();
        if (a >= artilleryCost) {
            artillery.bombard();
            return new HumanArtillery();
        }else {

            System.out.println("недостаточно мани");

            return null;
        }
    }}
