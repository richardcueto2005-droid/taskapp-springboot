public class Main {
    public static void main(String[] args) {
        // Instanciamos el controlador permitiendo hasta 10 tareas
        TaskController controller = new TaskController(10);

        System.out.println("=== STARTING TASK APP (LOCAL ARRAY) ===\n");

        // 1. Instanciando objetos Task (Valores por defecto)
        Task task1 = new Task(1, "Learn Java", "Study arrays and objects");
        Task task2 = new Task(2, "Do Homework", "Complete the MVC assignment");
        Task task3 = new Task(3, "Buy Groceries", "Milk, eggs, and bread");

        // 2. Probando la INSERCIÓN
        System.out.println("--- INSERTING TASKS ---");
        controller.insertTask(task1);
        controller.insertTask(task2);
        controller.insertTask(task3);
        
        // Verificamos que se guardaron
        controller.showAllTasks();

        // 3. Probando la BÚSQUEDA
        System.out.println("--- SEARCHING TASKS ---");
        controller.searchTask(2); // Buscamos la tarea 2 (debería encontrarla)
        controller.searchTask(99); // Buscamos la 99 (no debería existir)
        System.out.println();

        // 4. Probando la ELIMINACIÓN
        System.out.println("--- DELETING A TASK ---");
        controller.deleteTask(1); // Eliminamos la tarea 1
        
        // Verificamos cómo quedó el arreglo final
        controller.showAllTasks();
    }
}