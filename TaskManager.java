import java.util.*;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Görev eklendi: " + title);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Hiç görev yok.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + " - " + tasks.get(i));
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
            System.out.println("Görev tamamlandı: " + tasks.get(index).getTitle());
        } else {
            System.out.println("Geçersiz görev indexi.");
        }
    }

    public void listCompletedTasks() {
        List<Task> done = tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());

        if (done.isEmpty()) {
            System.out.println("Tamamlanmış görev yok.");
        } else {
            done.forEach(System.out::println);
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Silinen görev: " + tasks.get(index).getTitle());
            tasks.remove(index);
        } else {
            System.out.println("Geçersiz görev indexi.");
        }
    }

    public void sortTasksByTitle() {
        tasks.sort(Comparator.comparing(Task::getTitle));
        System.out.println("Görevler isme göre sıralandı.");
    }
}
