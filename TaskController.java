public class TaskController {
    private Task[] tasks;
    private int taskCount;

    public TaskController(int size) {
        tasks = new Task[size];
        taskCount = 0;
    }

    public void insertTask(Task newTask) {
        if (taskCount < tasks.length) {
            tasks[taskCount] = newTask;
            taskCount++;
            System.out.println("Success: Task inserted -> " + newTask.getTitle());
        } else {
            System.out.println("Error: The task array is full.");
        }
    }

    public Task searchTask(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                System.out.println("Found: " + tasks[i].toString());
                return tasks[i];
            }
        }
        System.out.println("Not Found: Task with ID " + id + " does not exist.");
        return null;
    }

    public void deleteTask(int id) {
        int indexToRemove = -1;
        
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null;
            taskCount--;
            System.out.println("Success: Task with ID " + id + " deleted.");
        } else {
            System.out.println("Error: Cannot delete. Task ID " + id + " not found.");
        }
    }
    public void showAllTasks() {
        System.out.println("\n--- All Current Tasks ---");
        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i].toString());
        }
        System.out.println("-------------------------\n");
    }
}