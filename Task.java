public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        return "Task [ID=" + id + ", Title=" + title + ", Status=" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}