// Фабрика для создания скелетов
public class SkeletonFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}
