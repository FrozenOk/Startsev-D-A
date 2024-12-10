import java.util.Random;

public class Maze {
    private final int width;
    private final int height;
    private final char[][] grid; // 'P' - игрок, 'E' - враг, '.' - пустая клетка
    private int playerX, playerY;
    private EnemyFactory enemyFactory;
    private Enemy enemy; // Текущий враг, которого встретил игрок

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
        initializeMaze();
        placePlayer();
        placeEnemy();
    }

    // Инициализация лабиринта пустыми клетками
    private void initializeMaze() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = '.';
            }
        }
    }

    // Помещаем игрока в начальную позицию
    private void placePlayer() {
        playerX = 0;
        playerY = 0;
        grid[playerY][playerX] = 'P';
    }

    // Размещаем врага в случайной позиции
    private void placeEnemy() {
        Random rand = new Random();
        int enemyX = rand.nextInt(width);
        int enemyY = rand.nextInt(height);

        // Генерируем случайного врага
        enemyFactory = randomEnemyFactory();
        enemy = enemyFactory.createEnemy();
        grid[enemyY][enemyX] = 'E'; // 'E' обозначает врага
    }

    // Возвращаем случайную фабрику врагов
    private EnemyFactory randomEnemyFactory() {
        Random rand = new Random();
        int enemyType = rand.nextInt(3);
        switch (enemyType) {
            case 0:
                return new OrcFactory();
            case 1:
                return new TrollFactory();
            default:
                return new SkeletonFactory();
        }
    }

    // Метод для отображения текущего состояния лабиринта
    public void displayMaze() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для перемещения игрока по лабиринту
    public boolean movePlayer(char direction) {
        int newX = playerX, newY = playerY;

        switch (direction) {
            case 'w': newY--; break; // Вверх
            case 's': newY++; break; // Вниз
            case 'a': newX--; break; // Влево
            case 'd': newX++; break; // Вправо
            default: System.out.println("Неверная команда! Используйте w, a, s, d.");
        }

        // Проверяем, не вышел ли игрок за границы лабиринта
        if (newX < 0 || newX >= width || newY < 0 || newY >= height) {
            System.out.println("Вы не можете выйти за пределы лабиринта!");
            return false;
        }

        // Проверяем, встретил ли игрок врага
        if (grid[newY][newX] == 'E') {
            System.out.println("Вы встретили врага!");
            enemy.attack();
            return true; // Встреча с врагом
        }

        // Перемещаем игрока
        grid[playerY][playerX] = '.';
        playerX = newX;
        playerY = newY;
        grid[playerY][playerX] = 'P';
        return false;
    }
}
