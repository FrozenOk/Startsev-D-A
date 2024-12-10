import java.util.Scanner;

public class MazeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze(5, 5); // Создаем лабиринт размером 5x5

        boolean gameRunning = true;

        System.out.println("Добро пожаловать в Поход по Лабиринту!");
        while (gameRunning) {
            maze.displayMaze();
            System.out.println("Введите команду (w - вверх, s - вниз, a - влево, d - вправо):");
            char command = scanner.next().charAt(0);

            boolean enemyEncountered = maze.movePlayer(command);
            if (enemyEncountered) {
                System.out.println("Бой завершен. Игра закончена.");
                gameRunning = false;
            }
        }

        scanner.close();
    }
}
