package practice.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        ArrayList<Task> tasks = new ArrayList<>();

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
                    tasks.add(nTask);

                    System.out.println("Task Added!");
                    break;
                case "2":
                    if(tasks.isEmpty()){
                        System.out.println("Empty Task List!");
                    } else{
                        System.out.println("\n--- Tasks ---");
                        for( int i= 0; i < tasks.size(); i++){
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "3":
                    if( tasks.isEmpty()){System.out.println("No tasks to complete!");}
                    else{
                        System.out.println("\n--- Tasks ---");
                        for( int i= 0; i < tasks.size(); i++){
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.println("Which task would you like to mark complete?: ");

                        try{
                            int compNum = Integer.parseInt(scanner.nextLine());

                            if(compNum > 0 && compNum <= tasks.size()){
                                Task selectedT = tasks.get(compNum-1);
                                selectedT.markComplete();
                                System.out.println("Completed Task!");
                            } else{
                                System.out.println("Invalid task number choice.");
                            }
                        } catch(NumberFormatException e){
                            System.out.println("Please eneter a valid number");
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
            exit =true;
        }
        scanner.close();
    }

}
