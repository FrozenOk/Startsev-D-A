// Класс для глобального счетчика запросов
class RequestCounter {
    private static RequestCounter instance; // Един экземпляр класса
    private int count; // Счетчик запросов

    // Приват
    private RequestCounter() {
        count = 0;
    }

    // Метод для получения экземпляра класса
    public static synchronized RequestCounter getInstance() {
        if (instance == null) {
            instance = new RequestCounter();
        }
        return instance;
    }

    // Метод для увеличения счетчика
    public synchronized void increment() {
        count++;
        System.out.println("Запрос добавлен. Общее количество запросов: " + count);
    }

    // Метод для получения текущего значения счетчика
    public synchronized int getCount() {
        return count;
    }
}

// Имитация работы с запросами
class HttpRequestHandler {
    public void handleRequest() {
        System.out.println("Обработка HTTP-запроса...");
        RequestCounter.getInstance().increment(); // Увелич глобальный счетчик
    }
}

// Главный класс для проверки работы
public class Main {
    public static void main(String[] args) {
        HttpRequestHandler handler1 = new HttpRequestHandler();
        HttpRequestHandler handler2 = new HttpRequestHandler();

        // Обработка нескольких запросов
        handler1.handleRequest();
        handler2.handleRequest();
        handler1.handleRequest();

        // Вывод общего количества запросов
        int totalRequests = RequestCounter.getInstance().getCount();
        System.out.println("Итого обработано запросов: " + totalRequests);
    }
}
