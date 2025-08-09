package practice.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

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
                System.out.println(">> Add Task selected (to be implemented)");
                    break;
                case "2":
                    System.out.println(">> View Tasks selected (to be implemented)");
                    break;
                case "3":
                    System.out.println(">> Mark Complete selected (to be implemented)");
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
