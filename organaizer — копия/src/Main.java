import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Organizer organizer = new Organizer("event.txt");

        JFrame frame = new JFrame("Органайзер");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextField dateField = new JTextField();
        JTextField typeField = new JTextField();
        JTextField descriptionField = new JTextField();

        JButton addButton = new JButton("Добавить ивент");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = dateField.getText();
                String type = typeField.getText();
                String description = descriptionField.getText();
                organizer.addEvent(date, type, description);
                JOptionPane.showMessageDialog(null, "Ивент добавлен");
            }
        });

        JTextField viewDateField = new JTextField();
        JButton viewButton = new JButton("Посмотреть ивент");
        JTextArea viewArea = new JTextArea();
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = viewDateField.getText();
                viewArea.setText("");
                if (organizer.events.containsKey(date)) {
                    for (Event event : organizer.events.get(date)) {
                        viewArea.append("Тип: " + event.type + ", Описание: " + event.description + "\n");
                    }
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Дата:"));
        panel.add(dateField);
        panel.add(new JLabel("Тип:"));
        panel.add(typeField);
        panel.add(new JLabel("Описание:"));
        panel.add(descriptionField);
        panel.add(addButton);
        panel.add(new JLabel("Посмотреть ивент по дате:"));
        panel.add(viewDateField);
        panel.add(viewButton);
        panel.add(viewArea);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}