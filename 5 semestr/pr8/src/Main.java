// Класс "Снимок" для сохранения состояния
class VolumeSnapshot {
    private final int volumeLevel;

    public VolumeSnapshot(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}

// Класс "Управление громкостью"
class VolumeControl {
    private int volumeLevel;

    public void setVolumeLevel(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Недопустимое значение громкости. Укажите значение от 0 до 100.");
        } else {
            volumeLevel = level;
            System.out.println("Громкость установлена на: " + volumeLevel);
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    // Сохранение текущего уровня громкости в снимок
    public VolumeSnapshot save() {
        return new VolumeSnapshot(volumeLevel);
    }

    // Восстановление уровня громкости из снимка
    public void restore(VolumeSnapshot snapshot) {
        volumeLevel = snapshot.getVolumeLevel();
        System.out.println("Громкость восстановлена на: " + volumeLevel);
    }
}

// Главный класс для демонстрации работы
public class Main {
    public static void main(String[] args) {
        VolumeControl volumeControl = new VolumeControl();

        // Установка уровня громкости
        volumeControl.setVolumeLevel(30);

        // Сохранение текущего состояния
        VolumeSnapshot snapshot = volumeControl.save();

        // Изменение уровня громкости
        volumeControl.setVolumeLevel(70);

        // Восстановление предыдущего состояния
        volumeControl.restore(snapshot);

        // Попытка установить некорректный уровень громкости
        volumeControl.setVolumeLevel(150);
    }
}
