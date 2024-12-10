import java.util.ArrayList;
import java.util.List;

// Интерфейс наблюдателя
interface WeatherObserver {
    void update(String weatherConditions);
}

// Интерфейс субъекта
interface WeatherSubject {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Класс субъекта (источник данных о погоде)
class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers = new ArrayList<>();
    private String weatherConditions;

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(weatherConditions);
        }
    }
}

// Конкретный наблюдатель
class User implements WeatherObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherConditions) {
        System.out.println("Пользователь " + name + " получил обновление: Погодные условия изменились: " + weatherConditions);
    }
}

// Точка входа
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        User user1 = new User("Иван");
        User user2 = new User("Мария");

        weatherStation.addObserver(user1);
        weatherStation.addObserver(user2);

        weatherStation.setWeatherConditions("Солнечно");
        weatherStation.setWeatherConditions("Дождливо");

        weatherStation.removeObserver(user1);

        weatherStation.setWeatherConditions("Облачно");
    }
}
