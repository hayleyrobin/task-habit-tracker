package practice.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;
    private static final String FILE_NAME = "tasks.txt";

    public TaskManager(){
        tasks = new ArrayList<>();
        loadTasksFromFIle();}

    public void addTask(Task newTask){
        tasks.add(newTask);
        saveTasksToFIle();
    }
    public ArrayList<Task> getTasks(){ return tasks;}

    public void viewTasks(){
        if(tasks.isEmpty()){ System.out.println("Empty Task List!");} 
        else{ 
            System.out.println("\n--- Tasks ---");
            for( int i= 0; i < tasks.size(); i++){
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
     public void markTaskComplete(int idx){
        if(idx >= 0 && idx <= tasks.size()){
            tasks.get(idx).markComplete();
            saveTasksToFIle();
            System.out.println("Completed Task!");
        } else{
            System.out.println("Invalid task number choice.");
        }
     }

    public void saveTasksToFIle(){
        try(PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))){
            for(Task task : tasks){
                writer.println(task.getTaskName() + "|" + task.getDueDate() + "|" + task.isHabit() + "|" + task.isCompleted());
            }
        } catch(IOException e){
            System.err.println("Error saving tasks: " + e.getMessage());
        }
    }

    public void loadTasksFromFIle(){
        System.out.println("Working directory: " + new File(".").getAbsolutePath());

        File file = new File(FILE_NAME);

        if (!file.exists()){return; }
        // tasks are saved as name|date|habit|done
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split("\\|");
                if(parts.length == 4){
                    String name = parts[0];
                    String dueDate = parts[1];
                    boolean isHabit = Boolean.parseBoolean(parts[2]);
                    boolean isComplete = Boolean.parseBoolean(parts[3]);

                    Task task = new Task(name, dueDate, isHabit, isComplete);
                    tasks.add(task);
                }
            }
        } catch(IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
        
    }


}
