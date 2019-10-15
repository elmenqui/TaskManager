import static java.lang.System.*;

public class Menu {

    public void MainMenu() {
        out.println(
                "\n" +
                        "     #####################################\n" +
                        "     ###             TOBE              ###\n" +
                        "     ###   The Ultimate Task Manager   ###\n" +
                        "     #####################################\n" +
                        "\n" +
                        "  You have " + "TBI" + " ongoing reminders " +
                        "and " + "TBI" + " completed ones.\n" +
                        "\n" +
                        "  Select an option by typing its corresponding number: \n" +
                        "\n" +
                        "   (1) Show Task List (by date or project)\n" +
                        "   (2) Add New Task\n" +
                        "   (3) Edit Task (update, mark as done, remove)\n" +
                        "   (4) Save and Exit\n " +
                        "\n" +
                        ">>>  ");

    }

    // Submenu of (1) Show Task List
    public void ShowTaskByMenu() {
        out.println(
                "  (1) Show Tasks by Projects\n" + "" +
                        "  (2) Show Tasks by Due Date\n" +
                        "  (3) Back to Main Menu\n" +
                        "\n" +
                        ">>>"
        );

    }

    // Submenu of (2) Add New Task
    public void AddTaskMenu() {
        out.println("Let's type some details in order to create a task entry.");
        out.println("\n");

        // Task Description input
        out.println("   - Give a descriptive title to the task:");
        out.println("\n");
        out.println("   >>>");

        // Due Date input
        out.println("   Type in the date and time the task is due:");
        out.println("\n");
        out.println("   >>>");

        // Category input
        out.println("   Type a category name you would like to group the task by:");
        out.println("\n");
        out.println("   >>>");

        // Task status selection
        out.println("-----------TASK PREVIEW--------------------");
        out.println("DUE DATE: " + "TBI(taskDateTime)");
        out.println("CATEGORY: " + "TBI(taskCategory)");
        out.println("TASK: " + "TBI(taskTitle)");
        out.println("-------------------------------------------");
        out.println("\n");
        out.println("Would you like to save the task?");
        out.println("\n");
        out.println(">>>");

    }

    // Submenu of (3) Edit Task
    public void EditMenu() {
        out.println("Edit Task\n");
        out.println("\n");
        out.println("  (1) Update Task Detail\n");
        out.println("  (2) Change Task Status\n");
        out.println("  (3) Remove Task\n");
        out.println("\n");
        out.println(">>>");

    }

    // Submenu of (4) Save and Exit
    public void Save() {

    }

    public static void main(String[] args) {
        Menu taskmenu = new Menu();

        while (true) {
            taskmenu.MainMenu();
            break;
        }
    }
}
