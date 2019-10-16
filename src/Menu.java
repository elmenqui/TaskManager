import java.util.Scanner;
import java.time.LocalDateTime;

public class Menu {

    private Scanner userInput = new Scanner(System.in);
    //TBI - Object?? Is this enough to make variables and create a task and then task list?


    public void MainMenu() {
        System.out.println("\n");
        System.out.println("   #####################################\n");
        System.out.println("   ###             TOBE              ###\n");
        System.out.println("   ###   The Ultimate Task Manager   ###\n");
        System.out.println("   #####################################\n");
        System.out.println("\n");
        System.out.println("You have " + "TBI" + " ongoing reminders and " + "TBI" + " completed ones.\n");
        System.out.println("\n");
        System.out.println("Select an option by typing its corresponding number: \n");
        System.out.println("\n");
        System.out.println("   (1) Show Task List (by date or project)\n");
        System.out.println("   (2) Add New Task\n");
        System.out.println("   (3) Edit Task (update, mark as done, remove)\n");
        System.out.println("   (4) Save and Exit\n ");
        System.out.println("\n");
        System.out.println(">>>  ");

        int selection = userInput.nextInt();

        switch (selection) {
            case 1:
                this.showTasks();
                break;
            case 2:
                this.createNew();
                break;
            case 3:
                this.editTask();
                break;
            case 4:
                this.saveExit();
                break;
            default:
                System.out.println("Invalid selection. Please type in the number");
                System.out.println("that correspond to the option you desire.");
                break;
        }
    }

    // Submenu of (1) Show Task List
    public void ShowTaskByMenu() {
        System.out.println("  (1) Show Tasks by Projects\n");
        System.out.println("  (2) Show Tasks by Due Date\n");
        System.out.println("  (3) Back to Main Menu\n");
        System.out.println("\n");
        System.out.println(">>>");

        int selection2 = userInput.nextInt();

        switch (selection2) {
            case 1:
                this.showTasksByProject();
                break;
            case 2:
                this.showTasksByDate();
                break;
            case 3:
                MainMenu();
                break;
            default:
                System.out.println("Invalid selection. Please type in the number");
                System.out.println("that correspond to the option you desire.");
                break;
        }
    }

    // Submenu of (2) Add New Task
    public void AddTaskMenu() {
        System.out.println("Let's type some details in order to create a task entry.");
        System.out.println("\n");

        // Task Description input
        System.out.println("Give a descriptive title to the task:");
        System.out.println("\n");
        System.out.println("   >>>");
        String taskTitle = userInput.nextInt();

        // Due Date input
        System.out.println("Let's set now set the due date and time.");
        System.out.println("First, type the date (yyyy, mm, dd) the task is due:");
        System.out.println("\n");
        System.out.println(">>>");

        // Return to the Task's Due Date input if not valid
        boolean validDate = false;

        while (!validDate) {
            String taskDate = userInput.nextLine();

            try {
                date = dateFormat.parse(taskDate);
                validDate = true;

            } catch (ParseException e) {
                System.out.println("Please enter a valid date using numbers to represent");
                System.out.println("the year (2019 - ), month (01-12), and day (01-31).");
            }
        }

        // Due Time input
        System.out.println("Now, type in the time (hh, mm) you would like to attach to it:");
        System.out.println("\n");
        System.out.println(">>>");

        // Return to the Task's Due Time input if not valid
        boolean validDate = false;

        while (!validTime) {
            String taskTime = userInput.nextLine();

            try {
                time = timeFormat.parse(taskTime);
                validTime = true;

            } catch (ParseException e) {
                System.out.println("Please enter a valid time format: HH, MM");
                System.out.println("HH (01 to 24) and MM (00 to 59).");
            }
        }

        //local date + local time
        LocalDateTime taskDateTime = LocalDateTime.of(taskDate, taskTime);

        // Category input
        System.out.println("   Type a category or project name you would like to group the task by:");
        System.out.println("\n");
        System.out.println("   >>>");
        String taskCategory = userInput.nextInt();

        // Task status selection
        System.out.println("-----------TASK PREVIEW--------------------");
        System.out.println("DUE DATE: " + taskDateTime);
        System.out.println("CATEGORY: " + taskCategory);
        System.out.println("TASK: " + taskTitle);
        System.out.println("-------------------------------------------");
        System.out.println("\n");
        System.out.println("Would you like to save the task?");
        System.out.println("\n");
        System.out.println(">>>");
        String taskStatus = userInput.nextInt();
    }

    // Submenu of (3) Edit Task
    public void EditMenu() {
        System.out.println("Edit Task\n");
        System.out.println("\n");
        System.out.println("  (1) Update Task Detail\n");
        System.out.println("  (2) Change Task Status\n");
        System.out.println("  (3) Remove Task\n");
        System.out.println("\n");
        System.out.println(">>>");

        // TBI
        // What task will be modified?
        // Will the user first search for a task
        // or is it to modify the current task?
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
