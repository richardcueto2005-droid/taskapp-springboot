public class Main {
    public static void main(String[] args) {
        TaskController controller = new TaskController(10);

        System.out.println("=== STARTING TASK APP (LOCAL ARRAY) ===\n");

        Task task1 = new Task(1, "Learn Java", "Study arrays and objects");
        Task task2 = new Task(2, "Do Homework", "Complete the MVC assignment");
        Task task3 = new Task(3, "Buy Groceries", "Milk, eggs, and bread");

        System.out.println("--- INSERTING TASKS ---");
        controller.insertTask(task1);
        controller.insertTask(task2);
        controller.insertTask(task3);
        
        controller.showAllTasks();

        System.out.println("--- SEARCHING TASKS ---");
        controller.searchTask(2);
        controller.searchTask(99);
        System.out.println();

        System.out.println("--- DELETING A TASK ---");
        controller.deleteTask(1);
        
        controller.showAllTasks();
    }
