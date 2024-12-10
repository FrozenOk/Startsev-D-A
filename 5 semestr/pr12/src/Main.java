
abstract class Task {
    protected String name;

    public Task(String name) {
        this.name = name;
    }

    public abstract void display(String indent);
}


class SimpleTask extends Task {
    public SimpleTask(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name);
    }
}


class CompositeTask extends Task {
    private List<Task> subTasks = new ArrayList<>();

    public CompositeTask(String name) {
        super(name);
    }

    public void addTask(Task task) {
        subTasks.add(task);
    }

    public void removeTask(Task task) {
        subTasks.remove(task);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (Task task : subTasks) {
            task.display(indent + "  ");
        }
    }
}

// Класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем простые задачи
        SimpleTask task1 = new SimpleTask("Написать отчет");
        SimpleTask task2 = new SimpleTask("Подготовить презентацию");

        // Создаем композитные задачи
        CompositeTask project = new CompositeTask("Проект: Ревизия");
        CompositeTask subProject = new CompositeTask("Раздел: Финансы");

        // Добавляем задачи
        subProject.addTask(new SimpleTask("Анализ расходов"));
        subProject.addTask(new SimpleTask("Подготовка бюджета"));

        // Добавляем подкатегорию
        project.addTask(subProject);
        project.addTask(task1);
        project.addTask(task2);


        project.display("");
    }
}
