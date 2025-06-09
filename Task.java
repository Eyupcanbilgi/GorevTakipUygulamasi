import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String title;
    private boolean isCompleted;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
        this.createdAt = LocalDateTime.now();
        this.completedAt = null;
    }

    public void complete() {
        this.isCompleted = true;
        this.completedAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    @Override
    public String toString() {
        String completedStr = isCompleted ? ", Tamamlandı: " + completedAt.format(formatter) : "";
        return "[ " + (isCompleted ? "✓" : " ") + " ] " + title 
               + " (Oluşturulma: " + createdAt.format(formatter) + completedStr + ")";
    }
}
