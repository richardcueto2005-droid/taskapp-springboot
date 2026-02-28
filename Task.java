public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    // Constructor
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false; // Por defecto no está completada
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    // Para mostrar la tarea en texto
    @Override
    public String toString() {
        return "Task [ID=" + id + ", Title=" + title + ", Status=" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}