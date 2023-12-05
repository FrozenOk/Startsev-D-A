import java.io.*;
import java.util.*;

class Organizer {
    Map<String, List<Event>> events;
    String filename;

    public Organizer(String filename) {
        this.events = new HashMap<>();
        this.filename = filename;
        loadEvents();
    }

    public void addEvent(String date, String type, String description) {
        Event event = new Event(type, description);
        if (!events.containsKey(date)) {
            events.put(date, new ArrayList<>());
        }
        events.get(date).add(event);
        saveEvents();
    }

    public void removeEvent(String date, String description) {
        if (events.containsKey(date)) {
            events.get(date).removeIf(event -> event.description.equals(description));
        }
        saveEvents();
    }

    public void viewEvents(String date) {
        if (events.containsKey(date)) {
            for (Event event : events.get(date)) {
                System.out.println("Тип: " + event.type + ", Описание: " + event.description);
            }
        }
    }

    public void editEvent(String date, String oldDescription, String newType, String newDescription) {
        if (events.containsKey(date)) {
            for (Event event : events.get(date)) {
                if (event.description.equals(oldDescription)) {
                    event.type = newType;
                    event.description = newDescription;
                }
            }
        }
        saveEvents();
    }

    private void loadEvents() {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                addEvent(parts[0], parts[1], parts[2]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Создание нового.");
        }
    }

    private void saveEvents() {
        try {
            FileWriter writer = new FileWriter(filename);
            for (String date : events.keySet()) {
                for (Event event : events.get(date)) {
                    writer.write(date + "," + event.type + "," + event.description + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка(");
            e.printStackTrace();
        }
    }
}