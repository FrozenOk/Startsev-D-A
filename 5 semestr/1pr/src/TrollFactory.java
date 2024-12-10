// Фабрика для создания троллей
public class TrollFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Troll();
    }
}