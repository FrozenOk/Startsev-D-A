import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Random;

public class SeaBattleApp implements GameInterface {
    private static final int GRID_SIZE = 5; // Размер поля 5x5
    private static final String DATABASE_FILE = "database.txt";
    private JButton[][] buttons;
    private boolean[][] shipPositions;
    private int shipsRemaining;

    public SeaBattleApp() {
        initializeGame();
    }

    @Override
    public void initializeGame() {
        JFrame frame = new JFrame("Морской бой");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel gridPanel = new JPanel(new GridLayout(GRID_SIZE, GRID_SIZE));
        buttons = new JButton[GRID_SIZE][GRID_SIZE];
        shipPositions = new boolean[GRID_SIZE][GRID_SIZE];

        Random random = new Random();
        shipsRemaining = 3; // 3 корабля на поле

        // Размещение кораблей
        for (int i = 0; i < shipsRemaining; i++) {
            int x, y;
            do {
                x = random.nextInt(GRID_SIZE);
                y = random.nextInt(GRID_SIZE);
            } while (shipPositions[x][y]);
            shipPositions[x][y] = true;
        }

        // Создание кнопок
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 18));
                int finalI = i;
                int finalJ = j;
                button.addActionListener(e -> handleMove(finalI, finalJ));
                buttons[i][j] = button;
                gridPanel.add(button);
            }
        }

        frame.add(gridPanel);
        frame.setVisible(true);
    }

    @Override
    public void handleMove(int x, int y) {
        if (shipPositions[x][y]) {
            buttons[x][y].setText("X");
            buttons[x][y].setBackground(Color.RED);
            shipPositions[x][y] = false;
            shipsRemaining--;
            if (isGameOver()) {
                JOptionPane.showMessageDialog(null, "Вы победили!");
                saveResult("Победа");
                resetGame();
            }
        } else {
            buttons[x][y].setText("~");
            buttons[x][y].setBackground(Color.BLUE);
        }
        buttons[x][y].setEnabled(false);
    }

    @Override
    public boolean isGameOver() {
        return shipsRemaining == 0;
    }

    @Override
    public void saveResult(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            writer.write(result + "\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ошибка сохранения результата!");
        }
    }

    private void resetGame() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setBackground(null);
                buttons[i][j].setEnabled(true);
                shipPositions[i][j] = false;
            }
        }
        Random random = new Random();
        shipsRemaining = 3;
        for (int i = 0; i < shipsRemaining; i++) {
            int x, y;
            do {
                x = random.nextInt(GRID_SIZE);
                y = random.nextInt(GRID_SIZE);
            } while (shipPositions[x][y]);
            shipPositions[x][y] = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SeaBattleApp::new);
    }
}
