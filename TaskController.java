public class TaskController {
    // Aquí está el arreglo local que pidió el profesor
    private Task[] tasks;
    private int taskCount;

    // Constructor: inicializa el arreglo para 10 tareas como máximo
    public TaskController(int size) {
        tasks = new Task[size];
        taskCount = 0;
    }

    // Método de INSERCIÓN
    public void insertTask(Task newTask) {
        if (taskCount < tasks.length) {
            tasks[taskCount] = newTask;
            taskCount++;
            System.out.println("Success: Task inserted -> " + newTask.getTitle());
        } else {
            System.out.println("Error: The task array is full.");
        }
    }

    // Método de BÚSQUEDA
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

    // Método de ELIMINACIÓN
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

    // Mostrar todas las tareas
    public void showAllTasks() {
        System.out.println("\n--- All Current Tasks ---");
        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i].toString());
        }
        System.out.println("-------------------------\n");
    }
}