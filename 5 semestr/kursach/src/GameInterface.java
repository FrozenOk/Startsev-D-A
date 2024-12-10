public interface GameInterface {
    void initializeGame(); // Инициализация игры
    void handleMove(int x, int y); // Обработка хода игрока
    boolean isGameOver(); // Проверка состояния игры
    void saveResult(String result); // Сохранение результата
}
