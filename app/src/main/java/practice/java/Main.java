package practice.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        TaskManager taskManager = new TaskManager();
        
        while(!exit){
            // Show menu options
            System.out.println("\n===== Task & Habit Tracker =====");
            System.out.println("1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Completed a Task");
            System.out.println("4. Exit");
            System.out.println("Enter: ");
            
            String input = scanner.nextLine();

            switch(input){
                case "1":
                    System.out.println(">> Enter task name: ");
                    String name = scanner.nextLine();

                    System.out.println(">> Enter due date of task: ");
                    String date = scanner.nextLine();

                    System.out.println(">> Is this task a habit? (yes or no):");
                    String habit = scanner.nextLine();
                    boolean isHabit = habit.equalsIgnoreCase("yes");

                    Task nTask = new Task(name, date, isHabit);
                    taskManager.addTask(nTask);

                    System.out.println("Task Added!");
                    break;
                case "2":
                    taskManager.viewTasks();
                    break;
                case "3":
                    if(taskManager.getTasks().isEmpty()){System.out.println("No tasks to complete!");}
                    else{
                        taskManager.viewTasks();
                        System.out.println("Which task would you like to mark complete?: ");
                        try{
                            int compNum = Integer.parseInt(scanner.nextLine());
                            taskManager.markTaskComplete(compNum - 1);
                        } catch(NumberFormatException e){
                            System.out.println("Please enter a valid number");
                        }
                    }
                    break;
                case "4":
                    System.out.println("Exiting... Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4."); 
            }
            exit = true;
        }
        scanner.close();
    }

}
