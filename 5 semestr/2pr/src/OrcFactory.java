public class OrcFactory implements UnitFactory {
    Points po = new Points();
    @Override
    public Infantry createInfantry() {
        int InfantryCost = 1;
        int a = po.points(InfantryCost);
        System.out.println(a);
        OrcInfantry infantry = new OrcInfantry();
        if (a>=InfantryCost){
            infantry.attack();
            return new OrcInfantry();
        }
        else {
            System.out.println("недостаточно мани");

            return new OrcInfantry();
    }}

    @Override
    public Tank createTank() {
        int TankCost = 2;
        int a = po.points(TankCost);
        System.out.println(a);
        OrcTank tank = new OrcTank();
        if (a >= TankCost) {
            tank.fire();
            return new OrcTank();
        } else {

            System.out.println("недостаточно мани");

            return new OrcTank();
        }
    }
    @Override
    public Artillery createArtillery() {

        int artilleryCost = 3;
        int a = po.points(artilleryCost);
        System.out.println(a);
        OrcArtillery artillery = new OrcArtillery();
        if (a >= artilleryCost) {
            artillery.bombard();
            return new OrcArtillery();
        }
        else {

            System.out.println("недостаточно мани");

        return new OrcArtillery();}


    }}

